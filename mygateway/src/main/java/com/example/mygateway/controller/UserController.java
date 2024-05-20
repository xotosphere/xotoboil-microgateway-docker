package com.example.mygateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/users")
public class UserController {
  
    @GetMapping("/{userId}")
    public ResponseEntity<String> getUserDetails(@PathVariable String userId) {
        // Invoke User Service API or perform necessary operations
        return ResponseEntity.ok("User details for userId: " + userId);
    }
}