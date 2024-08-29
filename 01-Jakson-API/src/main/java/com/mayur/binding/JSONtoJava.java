package com.mayur.binding;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONtoJava {
	public static void main(String[] args) throws Exception {
		File f= new File("book.json");
		
		ObjectMapper mapper=new ObjectMapper();
		
		Book book=mapper.readValue(f, Book.class);
		System.out.println(book);
	}
}
