package com.mayur.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mayur.bindings.Book;

@Controller
public class BookController {

	@GetMapping("/book")
	public String getbookdata(Model model ) {
		Book bookobj=new Book(101,"Spring",450.0);
		model.addAttribute("book",bookobj);
		return "book";
	}




	@GetMapping("/books")
	public String getbooksdata(Model model ) {
		Book b1=new Book(101,"Spring",350.0);
		Book b2=new Book(102,"Python",450.0);
		Book b3=new Book(103,"AWS",550.0);

		List<Book>booklist= Arrays.asList(b1,b2,b3);
		model.addAttribute("books",booklist);
		return "books"; 
	}
}

