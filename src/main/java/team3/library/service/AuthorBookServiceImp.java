package team3.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team3.library.dao.AuthorBookDao;
import team3.library.model.Author;
import team3.library.model.Book;

@Service
public class AuthorBookServiceImp implements AuthorBookService {

    @Autowired
    AuthorBookDao authorBookDao;

    @Override
    public void newAuthorBook(Book book, Author author) {
        authorBookDao.newAuthorBook(book, author);
    }
}
