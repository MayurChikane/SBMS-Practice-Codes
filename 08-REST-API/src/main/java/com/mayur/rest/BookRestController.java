package com.mayur.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mayur.entity.Book;
import com.mayur.service.BookService;

@RestController
public class BookRestController {

	@Autowired
	private BookService service;
	
	@PostMapping("/book")
	public ResponseEntity<String>addBook(@RequestBody Book book){
		String msg=service.addorupdatebook(book);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED); 
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>>getallBooks(){
		List <Book>allBooks= service.getAllBooks();
		return new ResponseEntity<List<Book>>(allBooks,HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String>updateBook(@RequestBody Book book){
		String msg=service.addorupdatebook(book);
		return new ResponseEntity<String>(msg,HttpStatus.CREATED); 
	}
	
	@DeleteMapping("/book/{bookid}")
	public ResponseEntity<String>deleteBook(@PathVariable Integer bookid){
		String msg= service.deleteBook(bookid);
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
