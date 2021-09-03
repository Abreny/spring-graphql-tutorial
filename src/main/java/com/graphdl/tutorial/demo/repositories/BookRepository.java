package com.graphdl.tutorial.demo.repositories;

import com.graphdl.tutorial.demo.entities.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
