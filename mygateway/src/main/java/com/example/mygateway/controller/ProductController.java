package com.example.mygateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/products")
public class ProductController {
  
    @GetMapping("/{productId}")
    public ResponseEntity<String> getProductDetails(@PathVariable String productId) {
        // Invoke Product Service API or perform necessary operations
        return ResponseEntity.ok("Product ID: " + productId);
    }
}