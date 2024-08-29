package com.mayur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView m=new ModelAndView();
		m.setViewName("index");
		return m;
	}
}
