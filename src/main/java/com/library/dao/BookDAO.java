package com.library.dao;

import com.library.model.Book;

import java.util.List;

public interface BookDAO {

    void addBook(Book book);
    List<Book> findAll();
    Book findBookById(Integer id);
    Book findBookByTitle(String title);
//    List<Book> findBookByAuthor(Author author);
    void updateBook(Book book);
    void deleteBook(Book book);

}
