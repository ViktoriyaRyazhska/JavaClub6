package com.booklib.dao;

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
    public Book findBookById(Long id) {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where id like :id");
        query.setParameter("id", id);
        return query.getSingleResult();
    }

}