package com.graphdl.tutorial.demo.forms;

import com.graphdl.tutorial.demo.entities.Author;

public class AuthorForm {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author toAuthor (Author old) {
        final Author auth = old == null ? new Author() : old;
        auth.setFirstName(firstName);
        auth.setLastName(lastName);

        return auth;
    }
}
