package com.graphdl.tutorial.demo.forms;

import com.graphdl.tutorial.demo.entities.Book;

public class BookForm {
    private String name;
    private Integer pageCount;
    private Long authorId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Book toBook (Book old) {
        final Book book = old == null ? new Book() : old;
        book.setName(name);
        book.setPageCount(pageCount);
        return book;
    }
}
