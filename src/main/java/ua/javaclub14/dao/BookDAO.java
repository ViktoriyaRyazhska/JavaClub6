package ua.javaclub14.dao;

import ua.javaclub14.model.Book;

import java.util.List;

public interface BookDAO {
//    Book findBookById(Long id);
    List<Book> list();
}
