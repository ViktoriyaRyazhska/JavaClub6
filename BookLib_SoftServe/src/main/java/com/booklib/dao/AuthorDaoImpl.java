package com.booklib.dao;

import com.booklib.entity.Author;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAuthor(Author author) {
        sessionFactory.getCurrentSession().persist(author);
    }

    @Override
    public List<Author> findAll() {
        @SuppressWarnings("unchecked")
        TypedQuery<Author> query = sessionFactory.getCurrentSession()
                .createQuery("from Author");
        return query.getResultList();
    }

    @Override
    public Author findAuthorById(Long id) {
        return sessionFactory.getCurrentSession().get(Author.class, id);
    }

    @Override
    public Author findAuthorBySurname(String surname) {
        @SuppressWarnings("unchecked")
        TypedQuery<Author> query = sessionFactory.getCurrentSession()
                .createQuery("from Author where surname like :surname");
        query.setParameter("surname", surname);
        return query.getSingleResult();
    }

}
