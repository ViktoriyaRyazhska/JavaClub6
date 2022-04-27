package com.booklib.service;

import java.util.List;

import com.booklib.entity.Author;

public interface AuthorService {
    Author findAuthorBySurname(String name);

    List<Author> findAll();

    Author findAuthorById(Long id);

}
