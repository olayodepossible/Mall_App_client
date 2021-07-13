package com.possible.mallappclient.web.client;

import com.possible.mallappclient.web.Model.ProductDto;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Component
@ConfigurationProperties(value = "mall.product", ignoreUnknownFields = false)
public class ProductClient {
    public final String PRODUCT_PATH_V1 = "/api/v1/product/";
    private final RestTemplate restTemplate;
    private String apiHost;

    public ProductClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public ProductDto getProdcutById(UUID id){
       return restTemplate.getForObject(apiHost+PRODUCT_PATH_V1 + id.toString(), ProductDto.class);
    }

    public void setApiHost(String apiHost) {
        this.apiHost = apiHost;
    }
}
