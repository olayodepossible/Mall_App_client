package com.possible.mallappclient.web.service;


import com.possible.mallappclient.web.Model.ProductDto;
import com.possible.mallappclient.web.Model.ProductTypeEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
//@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public ProductDto getProductById(UUID product_id) {
        return ProductDto.builder()
                .id(UUID.randomUUID())
                .productName("Vivo e2c")
                .productType(ProductTypeEnum.PHONE)
                .build();
    }

    @Override
    public ProductDto saveProduct(ProductDto productDto) {
        return ProductDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateProduct(UUID product_id, ProductDto productDto) {
        log.debug("Product updated");
    }

    @Override
    public void deleteById(UUID product_id) {
        log.debug("Product deleted");
    }
}
