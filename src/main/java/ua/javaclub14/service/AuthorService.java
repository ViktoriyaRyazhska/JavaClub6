package ua.javaclub14.service;

import ua.javaclub14.model.Author;


import java.util.List;

public interface AuthorService {
    List<Author> list();
    Author findAuthorById(Long id);
    void addAuthor(Author author);
    void deleteAuthor(Author author);
}
