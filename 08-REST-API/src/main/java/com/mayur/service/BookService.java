package com.mayur.service;

import java.util.List;
import com.mayur.entity.Book;


public interface BookService {
	
	public String addorupdatebook(Book book);
	public List<Book>getAllBooks();
	public String deleteBook(Integer bookid);
}
