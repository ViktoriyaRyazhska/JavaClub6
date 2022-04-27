package team6.library.javaclub6.dao;

import team6.library.javaclub6.model.Book;
import java.util.List;

public interface BookDao {
    List<Book> list();
    Book findById(int id);
    void save(Book book);
    void update(Book book);
    List<Book> findByTitle(String title);
}
