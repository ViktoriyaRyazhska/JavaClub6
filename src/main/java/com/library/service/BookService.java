package com.library.service;

import com.library.model.Author;
import com.library.model.Book;

import java.util.List;

public interface BookService {

    void addBook(Book book);
    List<Book> findAll();
    List<Book> popularBooks();
    Book findBookById(Long id);
    List<Book> findBookByTitle(String title);
    List<Book> findBookByAuthor(Author author);
    void updateBook(Book book);
    void deleteBook(Book book);
    Integer getNotReturned(Book book);
}
