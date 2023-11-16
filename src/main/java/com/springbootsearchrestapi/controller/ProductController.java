package com.springbootsearchrestapi.controller;

import com.springbootsearchrestapi.entity.Product;
import com.springbootsearchrestapi.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // http://localhost:8080/api/v1/products/search?query=name
    // http://localhost:8080/api/v1/products/search?query  -> To get all products
    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam("query") String query){
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    // http://localhost:8080/api/v1/products
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        Product products = productService.createProduct(product);
        return new ResponseEntity<>(products, HttpStatus.CREATED);
    }
}
