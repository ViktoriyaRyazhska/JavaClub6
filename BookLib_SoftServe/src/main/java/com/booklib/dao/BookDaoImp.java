package com.booklib.dao;

import com.booklib.entity.Author;
import com.booklib.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDaoImp implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
        return query.getResultList();
    }

    @Override
    public List<Book> findBookByTitle(String title) {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where title like :title");
        query.setParameter("title", title);
        return query.getResultList();
    }

    @Override
    public List<Book> findBookByAuthor(Author author) {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession()
                .createQuery("from Book where main_author= :author");
        query.setParameter("author", author);
        return query.getResultList();
    }

    @Override
    public Book findBookById(Long id) {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where id like :id");
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void deleteBook(Book book) {
        sessionFactory.getCurrentSession().delete(book);
    }

    @Override
    public void updateCopies(Long id, Integer copies) {
        // sessionFactory.getCurrentSession().update(book);
        int query = sessionFactory.getCurrentSession().createQuery(
                "update Book b " +
                        "set b.copies = :copies " +
                        "where b.id = :id")
                .setParameter("copies", copies)
                .setParameter("id", id)
                .executeUpdate();
    }

}