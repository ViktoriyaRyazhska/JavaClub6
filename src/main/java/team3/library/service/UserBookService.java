package team3.library.service;

import team3.library.model.Book;
import team3.library.model.User;
import team3.library.model.UserBook;

import java.util.List;

public interface UserBookService {
    void newRequest(Book book, User user);
    void returnBook(UserBook userBook);
    List<UserBook> hasReadBookList();
    List<UserBook> list();
}
