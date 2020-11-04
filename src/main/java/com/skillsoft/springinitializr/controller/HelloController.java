package com.skillsoft.springinitializr.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value = "/")
	public String index() {
		return "This is the main page of war spring initializr";
	}
	
	@GetMapping(value = "/welcome")
	public String welcome() {
		return "welcome to Spring initializr";
	}
	
	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello Spring Boot war";
	}

}
