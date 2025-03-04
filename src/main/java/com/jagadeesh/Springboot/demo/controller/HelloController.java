package com.jagadeesh.Springboot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/")
    public String helloController() {
        return "Welcome to Spring Boot Demo";
    }
    @GetMapping("/hello")
    public String hello() {
        return "--------------------------";
    }
}
