package com.mayur.client;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.mayur.bind.Book;

@Service
public class BookClient {
	
	public void invokegetbook() {
		String url="https://ashokit-book-app.herokuapp.com/books";
		
		WebClient client = WebClient.create();
		String block = client.get()
			.uri(url)
			.retrieve()
			.bodyToMono(String.class)
			.block();
		
		System.out.println(block);
	}
	
	public void invokePostBook() {
		
		Book book=new Book();
		book.setBookName("Angular");
		book.setBookPrice(456.3);
		
		String url="https://ashokit-book-app.herokuapp.com/book";
		
		WebClient client = WebClient.create();
		
		String block = client.post()
							 .uri(url)
							 .bodyValue(book)
							 .retrieve()
							 .bodyToMono(String.class)
							 .block();

		System.out.println(block);
	}
}
