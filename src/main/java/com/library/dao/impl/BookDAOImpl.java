package com.library.dao.impl;

import com.library.dao.BookDAO;
import com.library.model.Book;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addBook(Book book) {
        sessionFactory.getCurrentSession().persist(book);
    }

    @Override
    public List<Book> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    @Override
    public Book findBookById(Integer id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public Book findBookByTitle(String title) {
        Query query = sessionFactory.getCurrentSession().createQuery("from books where title=:title");
        query.setParameter("title", title);
        return (Book) query.uniqueResult();
    }

//    @Override
//    public List<Book> findBookByAuthor(Author author) {
//        return null;
//    }

    @Override
    public void updateBook(Book book) {
        sessionFactory.getCurrentSession().update(book);
    }

    @Override
    public void deleteBook(Book book) {
        sessionFactory.getCurrentSession().delete(book);
    }
}