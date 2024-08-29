package com.mayur.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcome")
	public String getWelcome() {
		return "Welcome to Microservices";
	}
}
