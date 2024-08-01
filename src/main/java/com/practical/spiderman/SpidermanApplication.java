package com.practical.spiderman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpidermanApplication {
	@GetMapping("/msg")
	public String show() {
		return "With Great Power Comes Great Responsibility";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpidermanApplication.class, args);
	}

}