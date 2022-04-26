package ua.javaclub14.service;


import ua.javaclub14.model.Book;

import java.util.List;

public interface BookService {

    List<Book> findBookByTitle(String title);
    List<Book> list();

//    List<Book> listByTitle(String title);


}


