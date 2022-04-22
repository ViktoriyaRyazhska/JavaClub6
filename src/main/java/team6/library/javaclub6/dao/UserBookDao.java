package team6.library.javaclub6.dao;

import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.model.UserBook;

public interface UserBookDao {
    void newRequest(Book book, User user);
    void returnBook(UserBook userBook);
}
