package team6.library.javaclub6.service;

import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;

public interface UserBookService {
    void newRequest(Book book, User user);
}
