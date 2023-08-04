package com.foksdev.bookstore.service;

import com.foksdev.bookstore.repository.BookRepository;
import model.Book;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class BookService {

    private final BookRepository bookRepository;

    public BookService (BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Optional<Book> finBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }




}
