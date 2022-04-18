package dao;
import model.Book;

import java.util.List;

public interface ManagerDAO {
    void addBook(Book book);
    List<Book> findAll();
    Book findBookById(Integer id);
    Book findBookByTitle(String title);
    void updateBook(Book book);
    void deleteBook(Book book);
}
