package com.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CrudController {

    @GetMapping("/hello")
    public String getHelloMessage() {
        return "Hello, this is a Spring Boot example!";
    }


}
