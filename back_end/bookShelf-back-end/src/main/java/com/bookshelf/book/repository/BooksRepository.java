package com.bookshelf.book.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookshelf.book.domain.Book;

public interface BooksRepository extends MongoRepository<Book, String> {

	List<Book> findByTitle(String name);

}
