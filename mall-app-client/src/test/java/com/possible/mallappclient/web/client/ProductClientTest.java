package com.possible.mallappclient.web.client;

import com.possible.mallappclient.web.Model.ProductDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductClientTest {
    @Autowired
    ProductClient client;

    @Test
    void getProductById() {
        ProductDto dto = client.getProdcutById(UUID.randomUUID());
        assertNotNull(dto);
    }
}