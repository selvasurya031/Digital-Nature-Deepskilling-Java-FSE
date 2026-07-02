package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository repository;

    // Setter Injection

    public void setBookRepository(BookRepository repository) {
    	this.repository = repository;
    }
    public void displayService() {
        System.out.println("Hellow from BookService");
        repository.displayRepository();
    }

}