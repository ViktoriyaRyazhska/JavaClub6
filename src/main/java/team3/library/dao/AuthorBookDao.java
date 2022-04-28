package team3.library.dao;

import team3.library.model.Book;
import team3.library.model.Author;

public interface AuthorBookDao {
    void newAuthorBook(Book book, Author author);
}
