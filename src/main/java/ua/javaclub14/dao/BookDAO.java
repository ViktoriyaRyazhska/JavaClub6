package ua.javaclub14.dao;

import ua.javaclub14.model.Author;
import ua.javaclub14.model.Book;

import java.util.List;

public interface BookDAO {
//    Book findBookById(Long id);
    List<Book> list();
//    List<Book> listByTitle(String title);

    public List<Book> findBookByTitle(String title);


    void addBook(Book book);

    void deleteBook(Book book);
    Book findBookById(Long id);

    public List<Book> findBookByPopular();

}
