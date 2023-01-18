package com.proj3.warehouse.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/register")
public class Register {

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Hello from our API");
    }
}
