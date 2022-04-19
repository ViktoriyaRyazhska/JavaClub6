package com.library.service.impl;

import com.library.dao.BookDAO;
import com.library.model.Author;
import com.library.model.Book;
import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

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
    public Book findBookById(Long id) {
        return bookDAO.findBookById(id);
    }

    @Override
    @Transactional
    public List<Book> findBookByTitle(String title) {
        return bookDAO.findBookByTitle(title);
    }

    @Override
    public List<Book> findBookByAuthor(Author author) {
        return bookDAO.findBookByAuthor(author);
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
