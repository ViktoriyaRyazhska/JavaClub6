package com.booklib.service;

import java.util.List;

import com.booklib.entity.Book;

public interface BookService {
    List<Book> list();

    List<Book> findBookByTitle(String title);

    Book findBookById(Long id);
}
