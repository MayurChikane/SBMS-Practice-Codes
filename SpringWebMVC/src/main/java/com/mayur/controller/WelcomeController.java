package com.mayur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView getwelcome()
	{
		ModelAndView m=new ModelAndView();
		m.addObject("msg","Welcome to the real world...");
		m.setViewName("index");
		
		
		return m;
	}
}
