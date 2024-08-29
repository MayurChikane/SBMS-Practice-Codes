package com.mayur.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestControlller {

	@Value("${welcome.msg}")
	private String msg;
	
	@GetMapping("/")
	public String welcome() {
		return msg;
	}
}
