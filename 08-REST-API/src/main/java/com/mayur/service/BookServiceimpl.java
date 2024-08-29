package com.mayur.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.mayur.entity.Book;
import com.mayur.repository.BookRepository;

@Service
public class BookServiceimpl implements BookService {

	private BookRepository repository;
	
	public BookServiceimpl(BookRepository repository) {
		this.repository=repository;
	}
	@Override
	public String addorupdatebook(Book book) {
		Integer id=book.getBookid();
		repository.save(book);
		if(id==null) {
			return ("record inserted...");
		}
		else {
			return ("record updated...");
		}
		
	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public String deleteBook(Integer bookid) {
		repository.deleteById(bookid);
		return "book deleted...";
	}

}
