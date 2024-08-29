package com.mayur.client;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mayur.bind.Book;

@Service
public class BookClient {
	
	public void invokeBookTicket() {
		
		String url="https://ashokit-book-app.herokuapp.com/book";
		
		Book b= new Book();
		b.setBookName("Java");
		b.setBookPrice(354.0);
		
		RestTemplate rt=new RestTemplate();
		ResponseEntity<String> postForEntity = rt.postForEntity(url, b, String.class);
		System.out.println(postForEntity);
	}
	
	public void invokegetBook() {
		String url="https://ashokit-book-app.herokuapp.com/book";
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> forEntity=rt.getForEntity(url, String.class);
		//ResponseEntity<Book[]> forEntity = rt.getForEntity(url, Book[].class);
		String body = forEntity.getBody();
		System.out.println(body);
	}
}
