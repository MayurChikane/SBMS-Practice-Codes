package com.mayur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
	
	@GetMapping("/")
	public String getWelcomeMessage(Model model) {
		model.addAttribute("msg","welcome to java club");
		
		return "index";
	}
}
