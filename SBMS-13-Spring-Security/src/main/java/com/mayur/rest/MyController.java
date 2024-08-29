package com.mayur.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/name")
	public String getName() {
		return "Mayur Chikane";
	}
	
	@GetMapping("/lname")
	public String getLname() {
		return "Mayur Chikane";
	}
	
	@GetMapping("/age")
	public String getAge() {
		return "Mayur Chikane";
	}
	
	@GetMapping("/address")
	public String getAddress() {
		return "Mayur Chikane";
	}
}
