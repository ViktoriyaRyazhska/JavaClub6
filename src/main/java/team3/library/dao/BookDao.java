package team3.library.dao;

import team3.library.model.Book;

import java.util.List;

public interface BookDao {
    List<Book> list();
    Book findById(int id);
    void save(Book book);
}
