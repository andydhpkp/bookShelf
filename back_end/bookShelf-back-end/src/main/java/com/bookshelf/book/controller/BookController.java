package com.bookshelf.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookshelf.book.domain.Book;
import com.bookshelf.book.repository.BooksRepository;

@RestController
public class BookController {
	
	@Autowired
	private BooksRepository repository;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/books", method = RequestMethod.GET)
	public List<Book> getAllBooks() {
		System.out.println("Retrieving Books.....");
		return repository.findAll();
	}
}
