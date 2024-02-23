package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebApplicationTests {
	@RequestMapping("/test")
	public String test() {
		System.out.println("Hi!");
		return "Hello World";
	}
}
