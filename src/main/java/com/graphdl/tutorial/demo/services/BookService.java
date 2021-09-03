package com.graphdl.tutorial.demo.services;

import java.util.List;

import com.graphdl.tutorial.demo.entities.Book;
import com.graphdl.tutorial.demo.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private @Autowired BookRepository bookRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id)
            .orElse(null);
    }
}
