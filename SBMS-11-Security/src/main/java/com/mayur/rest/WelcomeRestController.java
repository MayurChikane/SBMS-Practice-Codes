package com.mayur.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	@GetMapping("/")
	public String getmsg() {
		String msg="Welcome!!!!";
		return msg;
	}
}
