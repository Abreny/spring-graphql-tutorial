package com.graphdl.tutorial.demo.controllers;

import java.util.List;

import com.graphdl.tutorial.demo.entities.Book;
import com.graphdl.tutorial.demo.services.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController (BookService bookService) {
        this.bookService = bookService;
    }

    @QueryMapping
    public Book bookById(@Argument Long id) {
        return bookService.getBookById(id);
    }
    @QueryMapping
    public List<Book> books() {
        return bookService.getAll();
    }
}
