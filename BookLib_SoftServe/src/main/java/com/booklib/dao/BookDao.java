package com.booklib.dao;

import com.booklib.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> list();
}
