package com.mayur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mayur.binding.Product;

@Controller
public class ProductController {
	@GetMapping("/")
	public String getprodform(Model model) {
		Product productobj=new Product();
		model.addAttribute("product",productobj);
		return "index";
	}
	
	@GetMapping("/product")
	public String handleFormSubmit(Product product,Model model) {
		System.out.println(product);
		model.addAttribute("msg","Product Saved Successfully");
		return "success";
	}
}
