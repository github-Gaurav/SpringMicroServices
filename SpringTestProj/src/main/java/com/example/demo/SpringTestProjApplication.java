package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTestProjApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Test");
		SpringApplication.run(SpringTestProjApplication.class, args);
		
	}
}
