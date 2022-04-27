package ua.javaclub14.dao;

import ua.javaclub14.model.Author;

import java.util.List;

public interface AuthorDAO {
    List<Author> list();
    Author findAuthorById(Long id);
    void addAuthor(Author author);
    void deleteAuthor(Author author);


}
