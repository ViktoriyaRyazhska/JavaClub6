package com.booklib.service;

import java.util.List;

import com.booklib.entity.Author;
import com.booklib.entity.Book;

public interface BookService {
    List<Book> list();

    List<Book> findBookByTitle(String title);

    List<Book> findBookByAuthor(Author author);

    Book findBookById(Long id);

    void updateCopies(Long id, Integer copies);

    void deleteBook(Book book);

    void save(Book book);
}
