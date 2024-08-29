package com.mayur.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {
	
	@GetMapping("/book/{name}/{author}")
	public ResponseEntity<String> getbookprice(@PathVariable("name")String name,@PathVariable("author")String author){
		String respbody=name+" Price is rs 400..... and author is .."+author;
		return new ResponseEntity<>(respbody ,HttpStatus.OK);
	}
}
