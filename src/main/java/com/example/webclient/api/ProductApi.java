package com.example.webclient.api;

import com.example.webclient.service.Product;
import com.example.webclient.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductApi {

    @Autowired
    ProductService productService;

    @RequestMapping(method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public List<Product> listProducts(){
        return productService.listProducts();
    }
}
