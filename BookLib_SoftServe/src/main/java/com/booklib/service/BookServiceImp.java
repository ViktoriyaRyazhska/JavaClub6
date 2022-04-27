package com.booklib.service;

import com.booklib.dao.BookDao;
import com.booklib.entity.Author;
import com.booklib.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional(readOnly = true)
    public List<Book> list() {
        return bookDao.list();
    }

    @Transactional(readOnly = true, rollbackFor = { java.lang.Exception.class })
    public List<Book> findBookByTitle(String title) {
        return bookDao.findBookByTitle(title);
    }

    @Transactional(readOnly = true, rollbackFor = { java.lang.Exception.class })
    public List<Book> findBookByAuthor(Author author) {
        return bookDao.findBookByAuthor(author);
    }

    @Transactional(readOnly = true, rollbackFor = { java.lang.Exception.class })
    public Book findBookById(Long id) {
        return bookDao.findBookById(id);
    }

    @Override
    @Transactional
    public void updateCopies(Long id, Integer copies) {
        bookDao.updateCopies(id, copies);

    }

    @Override
    @Transactional
    public void deleteBook(Book book) {
        bookDao.deleteBook(book);
    }

    @Override
    @Transactional
    public void save(Book book) {
        bookDao.save(book);
    }
}