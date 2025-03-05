package com.jagadeesh.Springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		System.out.println("Hello Jagadeesh");
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
