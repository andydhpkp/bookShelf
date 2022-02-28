package com.bookshelf.book;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookshelf.book.domain.Book;
import com.bookshelf.book.repository.BooksRepository;

@SpringBootApplication
public class AccessingDataApplication implements CommandLineRunner {
	
	@Autowired
	private BooksRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(AccessingDataApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			System.out.println("Find Book by title:");
			System.out.println(repository.findByTitle("Harry Potter and the Half-Blood Prince (Harry Potter  #6)"));
			
			System.out.println("Find by ID:");
			System.out.println(repository.findById("1"));
			Optional<Book> bookOpt = repository.findById("1");
			
			Book book = bookOpt.get();
			System.out.println(book);
			
		} catch (Exception e) {
			System.out.println("Didn't work");
			System.out.println(e);
			System.out.println("getCause = " + e.getCause());
		}
	}
}
