package com.example.webclient.productSevice;

import com.example.webclient.service.ProductServiceService;
import com.example.webclient.service.ProductService;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ProductsService {
    @Bean
    public ProductService productService(){
        ProductServiceService products = new ProductServiceService();
        ProductService service = products.getProductServicePort();
        return service;
    }
}
