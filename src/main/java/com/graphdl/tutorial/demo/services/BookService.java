package com.graphdl.tutorial.demo.services;

import java.util.List;

import com.graphdl.tutorial.demo.entities.Author;
import com.graphdl.tutorial.demo.entities.Book;
import com.graphdl.tutorial.demo.forms.BookForm;
import com.graphdl.tutorial.demo.repositories.AuthorRepository;
import com.graphdl.tutorial.demo.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private @Autowired BookRepository bookRepository;
    private @Autowired AuthorRepository authorRepository;

    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id)
            .orElse(null);
    }

    public Book save(BookForm form) {
        final Author auth = authorRepository.findById(form.getAuthorId()).orElseThrow(() -> new IllegalArgumentException("The author id " + form.getAuthorId() + " was not found in database"));
        final Book book = form.toBook(null);
        book.setAuthor(auth);
        return bookRepository.save(book);
    }
}
