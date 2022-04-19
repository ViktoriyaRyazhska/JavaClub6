package com.library.dao.impl;

import com.library.dao.BookDAO;
import com.library.model.Author;
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
        sessionFactory.getCurrentSession().save(book);
    }

    @Override
    public List<Book> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Book").list();
    }

    @Override
    public Book findBookById(Long id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        Query query = sessionFactory.getCurrentSession().createQuery("from book where title=:title");
        query.setParameter("title", title);
        return query.list();
    }

    @Override
    public List<Book> findBookByAuthor(Author author) {
        Long authorId = author.getAuthorId();
        Query query = sessionFactory.getCurrentSession().createQuery("from book join book_author on book_id where author.id=:authorId");
        return query.list();
    }

//    @Override
//    public List<Book> findBookByAuthor(Author author) {
//        Long authorId = author.getAuthorId();
//        Query query = sessionFactory.getCurrentSession().createQuery("from book join book_author on book_id where author.id=:authorId");
//        return query.list();
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
