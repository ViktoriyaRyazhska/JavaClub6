package com.library.dao.impl;

import com.library.dao.AuthorDAO;
import com.library.model.Author;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AuthorDAOImpl implements AuthorDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addAuthor(Author author) {
        sessionFactory.getCurrentSession().persist(author);
    }

    @Override
    public List<Author> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Author").list();
    }

    @Override
    public Author findAuthorById(Long id) {
        return sessionFactory.getCurrentSession().get(Author.class, id);
    }
}
