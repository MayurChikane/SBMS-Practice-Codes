package com.mayur.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String>getwelcome(@RequestParam("name")String name){
		String resPayload=name+" ,Welcome to rest services";
		
		
		return new ResponseEntity<>(resPayload,HttpStatus.OK);	
	}
	
	@GetMapping("/greet")
	public String greet() {
		
		String resPayload="Good Morning";
		return resPayload; 
	}
}
