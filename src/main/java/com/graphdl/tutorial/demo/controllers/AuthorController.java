package com.graphdl.tutorial.demo.controllers;

import java.util.List;

import com.graphdl.tutorial.demo.entities.Author;
import com.graphdl.tutorial.demo.services.AuthorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @QueryMapping
    public List<Author> authors() {
        return authorService.getAll();
    }
}
