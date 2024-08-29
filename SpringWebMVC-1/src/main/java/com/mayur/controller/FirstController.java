package com.mayur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.core.model.Model;

@Controller
public class FirstController {

	@GetMapping("/welcome")
	public ModelAndView getwelcome()
	{

		ModelAndView m=new ModelAndView();
		m.addObject("msg","Welcome to springboot and microservices...");
		m.setViewName("welcome");
		
		return m;
	}
	
	@GetMapping("/greet")
	public ModelAndView getgreetmsg()
	{
		ModelAndView m = new ModelAndView();
		m.addObject("message","Good Morning...");
		m.setViewName("greet");
		
		return m;
	}
}
