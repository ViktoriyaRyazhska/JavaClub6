package com.booklib.service;

import com.booklib.dao.BookDao;
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
    public Book findBookById(Long id) {
        return bookDao.findBookById(id);
    }

}