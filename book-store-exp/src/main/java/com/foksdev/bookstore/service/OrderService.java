package com.foksdev.bookstore.service;


import model.Book;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service

public class OrderService {


    private final BookService bookService;
    private final Logger logger = (Logger) LoggerFactory.getLogger(OrderService.class);

    public OrderService(BookService bookService) {
        this.bookService = bookService;
    }

    public Order putAnOrder(List<Integer> bookIdList) {
        List<Optional<Book>> bookList = bookIdList.stream()
                .map(bookService::finBookById).collect(Collectors.toList());

        Double totalPrice = bookList.stream()
                .reduce(0, Double::sum);





    }

}
