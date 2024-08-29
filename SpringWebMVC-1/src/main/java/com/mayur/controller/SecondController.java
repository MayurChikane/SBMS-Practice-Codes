package com.mayur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {

	@GetMapping("/wish")
	public ModelAndView getwishmsg() {
		ModelAndView m=new ModelAndView();
		m.addObject("msg","All the best ...!");
		m.setViewName("wish");
		return m;
	}
}
