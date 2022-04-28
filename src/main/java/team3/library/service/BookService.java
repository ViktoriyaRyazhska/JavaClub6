package team3.library.service;

import team3.library.model.Book;
import java.util.List;

public interface BookService {
    List<Book> list();
    Book findById(int id);
    void save(Book book);
    List<Book> popularList(int year, int month);
}
