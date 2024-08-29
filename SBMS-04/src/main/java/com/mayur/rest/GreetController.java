package com.mayur.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.clent.WelcomeApiClient;

@RestController
public class GreetController {

	@Autowired
	private WelcomeApiClient client;
	
	@GetMapping("/greet")
	public String getGreetmsg() {
		String greetmsg="Good Morning";
		String welcomemsg=client.invokewelcome();
		return greetmsg+welcomemsg;
	}
	
}
