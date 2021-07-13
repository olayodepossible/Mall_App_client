package com.possible.mallappclient.web.service;



import com.possible.mallappclient.web.Model.ProductDto;

import java.util.UUID;

public interface ProductService {
    ProductDto getProductById(UUID product_id);

    ProductDto saveProduct(ProductDto productDto);

    void updateProduct(UUID product_id, ProductDto productDto);

    void deleteById(UUID product_id);
}
