package team3.library.dao;

import team3.library.model.Book;
import team3.library.model.User;
import team3.library.model.UserBook;

import java.util.List;

public interface UserBookDao {
    void newRequest(Book book, User user);
    void returnBook(UserBook userBook);
    List<UserBook> hasReadBookList();
    List<UserBook> list();
}
