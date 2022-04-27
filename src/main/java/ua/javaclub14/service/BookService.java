package ua.javaclub14.service;


import ua.javaclub14.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findBookByTitle(String title);
    List<Book> list();

    void addBook(Book book);

//    List<Book> listByTitle(String title);


}


