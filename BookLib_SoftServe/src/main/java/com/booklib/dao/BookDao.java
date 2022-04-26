package com.booklib.dao;

import com.booklib.entity.Author;
import com.booklib.entity.Book;
import com.booklib.entity.User;

import java.util.List;

public interface BookDao {
    List<Book> list();

    List<Book> findBookByTitle(String title);

    List<Book> findBookByAuthor(Author author);

    Book findBookById(Long id);

    void updateCopies(Long id, Integer copies);

    void deleteBook(Book book);

    void save(Book book);
}
