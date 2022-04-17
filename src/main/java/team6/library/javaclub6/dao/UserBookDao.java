package team6.library.javaclub6.dao;

import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;

public interface UserBookDao {
    void newRequest(Book book, User user);
}
