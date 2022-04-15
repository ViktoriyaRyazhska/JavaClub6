package com.library.service.impl;

import com.library.dao.BookDAO;
import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAO bookDAO;

    @Override
    @Transactional
    public void addBook(Book book) {
        bookDAO.addBook(book);
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    @Transactional
    public Book findBookById(Integer id) {
        return bookDAO.findBookById(id);
    }

    @Override
    @Transactional
    public Book findBookByTitle(String title) {
        return bookDAO.findBookByTitle(title);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        bookDAO.updateBook(book);
    }

    @Override
    @Transactional
    public void deleteBook(Book book) {
        bookDAO.deleteBook(book);
    }
}
