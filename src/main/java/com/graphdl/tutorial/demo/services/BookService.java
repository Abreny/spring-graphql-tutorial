package com.graphdl.tutorial.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.graphdl.tutorial.demo.entities.Author;
import com.graphdl.tutorial.demo.entities.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private @Autowired AuthorService authorService;
    private static Random rand = new Random();

    public List<Book> getAll() {
        final List<Book> books = new ArrayList<>();
        final List<Author> authors = authorService.getAll();
        for (int i = 0; i < 100; i++) {
            final Book book = new Book();
            book.setId(i + 1L);
            book.setName("book name " + i);
            book.setPageCount(Math.abs(rand.nextInt()) % 2000);
            book.setAuthor(authors.get(Math.abs(rand.nextInt()) % authors.size()));
            books.add(book);
        }
        return books;
    }

    public Book getBookById(Long id) {
        final List<Book> books = getAll();
        return books.stream().filter(b -> b.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
}
