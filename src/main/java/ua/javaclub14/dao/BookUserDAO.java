package ua.javaclub14.dao;

import ua.javaclub14.model.Book;
import ua.javaclub14.model.BookUser;

import java.util.Date;
import java.util.List;

public interface BookUserDAO {
    List<BookUser> listByDate(Date start,Date finish);
}
