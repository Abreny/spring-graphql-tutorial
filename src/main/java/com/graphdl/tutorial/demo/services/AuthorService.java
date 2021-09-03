package com.graphdl.tutorial.demo.services;

import java.util.List;

import com.graphdl.tutorial.demo.entities.Author;
import com.graphdl.tutorial.demo.forms.AuthorForm;
import com.graphdl.tutorial.demo.repositories.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private @Autowired AuthorRepository authorRepository;

    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    public Author save(AuthorForm form) {
        return authorRepository.save(form.toAuthor(null));
    }
}
