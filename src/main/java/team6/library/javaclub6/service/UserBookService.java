package team6.library.javaclub6.service;

import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.model.UserBook;

public interface UserBookService {
    void newRequest(Book book, User user);
    void returnBook(UserBook userBook);
}
