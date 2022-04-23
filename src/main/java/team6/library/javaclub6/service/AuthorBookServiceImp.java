package team6.library.javaclub6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team6.library.javaclub6.dao.AuthorBookDao;
import team6.library.javaclub6.model.Author;
import team6.library.javaclub6.model.Book;

@Service
public class AuthorBookServiceImp implements AuthorBookService {

    @Autowired
    AuthorBookDao authorBookDao;

    @Override
    public void newAuthorBook(Book book, Author author) {
        authorBookDao.newAuthorBook(book, author);
    }
}
