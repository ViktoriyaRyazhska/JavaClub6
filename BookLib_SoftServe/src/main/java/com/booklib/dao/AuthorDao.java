package com.booklib.dao;

import com.booklib.entity.Author;

import java.util.List;

public interface AuthorDao {

    void addAuthor(Author author);
    List<Author> findAll();
    Author findAuthorById(Long id);

}

