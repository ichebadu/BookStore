package com.iche.catalogservice.web.controllers;

import com.iche.catalogservice.domain.PagedResult;
import com.iche.catalogservice.domain.Product;
import com.iche.catalogservice.domain.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    ProductController(ProductService productService){
        this.productService = productService;
    }
    @GetMapping
    PagedResult<Product> getProduct(@RequestParam(name = "page", defaultValue = "1")int pageNo){
        return productService.getProducts(pageNo);
    }
}
