package com.library.service;

import com.library.model.Author;

import java.util.List;

public interface AuthorService {

    void addAuthor(Author author);
    List<Author> findAll();
    Author findAuthorById(Long id);

}
