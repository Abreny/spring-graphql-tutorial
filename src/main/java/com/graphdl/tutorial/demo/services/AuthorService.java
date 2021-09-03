package com.graphdl.tutorial.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.graphdl.tutorial.demo.entities.Author;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    public List<Author> getAll() {
        final List<Author> authors = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            final Author a = new Author();
            a.setId(i + 1L);
            a.setLastName("lastName" + i);
            a.setFirstName("firstName" + i);
            authors.add(a);
        }
        return authors;
    }
}
