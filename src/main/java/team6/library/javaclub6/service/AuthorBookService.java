package team6.library.javaclub6.service;

import team6.library.javaclub6.model.Author;
import team6.library.javaclub6.model.Book;

public interface AuthorBookService {
    void newAuthorBook(Book book, Author author);
    void update(Book book, Author author);
    int findAuthorIdByBookId(int id);
}
