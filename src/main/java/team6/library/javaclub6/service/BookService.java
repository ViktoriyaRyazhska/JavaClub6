package team6.library.javaclub6.service;

import team6.library.javaclub6.model.Book;
import java.util.List;

public interface BookService {
    List<Book> list();
    Book findById(int id);
    void save(Book book);
    List<Book> popularList(int year, int month);
}
