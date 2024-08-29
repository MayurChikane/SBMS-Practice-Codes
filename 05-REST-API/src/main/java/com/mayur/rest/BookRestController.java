package com.mayur.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayur.binding.Book;

@RestController
public class BookRestController {

	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book){
		
		System.out.println(book);
		
		String msg="Book Added Successfully";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
}
