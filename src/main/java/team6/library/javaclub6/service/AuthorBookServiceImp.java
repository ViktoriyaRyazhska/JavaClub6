package team6.library.javaclub6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.dao.AuthorBookDao;
import team6.library.javaclub6.model.Author;
import team6.library.javaclub6.model.Book;

@Service
public class AuthorBookServiceImp implements AuthorBookService {

    @Autowired
    AuthorBookDao authorBookDao;

    @Transactional
    public void newAuthorBook(Book book, Author author) {
        authorBookDao.newAuthorBook(book, author);
    }

    @Transactional
    public void update(Book book, Author author) {
        authorBookDao.update(book, author);
    }

    @Transactional
    public int findAuthorIdByBookId(int id) {
        return authorBookDao.findAuthorIdByBookId(id);
    }
}
