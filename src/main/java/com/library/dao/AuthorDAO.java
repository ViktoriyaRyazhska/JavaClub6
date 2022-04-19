package com.library.dao;

import com.library.model.Author;

import java.util.List;

public interface AuthorDAO {

    void addAuthor(Author author);
    List<Author> findAll();
    Author findAuthorById(Long id);

}
