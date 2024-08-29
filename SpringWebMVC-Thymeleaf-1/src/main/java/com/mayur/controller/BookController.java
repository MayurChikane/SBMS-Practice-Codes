package com.mayur.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mayur.binding.Book;

@Controller
public class BookController {

	@GetMapping("/")
	public String displayForm(Model model) {
		
		Book bookobj=new Book();
		model.addAttribute("book",bookobj);
		return "index";
	}
	
	@PostMapping("/book")
	public String savebook(Book book,Model model) {
		
		System.out.println(book);
		model.addAttribute("msg","Book saved successfullly");
		return "success";
		
	}
}
