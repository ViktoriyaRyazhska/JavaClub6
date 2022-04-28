package team3.library.service;

import team3.library.model.Book;
import team3.library.model.Author;

public interface AuthorBookService {
    void newAuthorBook(Book book, Author author);
}
