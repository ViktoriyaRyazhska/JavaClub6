package team6.library.javaclub6.dao;

import team6.library.javaclub6.model.Author;
import team6.library.javaclub6.model.Book;

public interface AuthorBookDao {
    void newAuthorBook(Book book, Author author);
}
