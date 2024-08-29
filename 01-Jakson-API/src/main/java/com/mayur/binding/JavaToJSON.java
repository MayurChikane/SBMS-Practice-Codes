package com.mayur.binding;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJSON {
	public static void main(String[] args) throws Exception {
		
		Author a=new Author();
		a.setAuthorname("Aditya");
		a.setAuthoremail("mayurchikan123@gmail.com");
		a.setAuthorphone(9881726179l);
		
		
		Book book =new Book();
		
		book.setId(101);
		book.setName("Spring");
		book.setPrice(100.0);
		book.setAuthor(a);
		
		ObjectMapper mapper= new ObjectMapper();
		mapper.writeValue(new File("book.json"), book);
		System.out.println("Conversion Complete....");
	}
}
