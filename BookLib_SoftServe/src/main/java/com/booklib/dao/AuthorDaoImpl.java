package com.booklib.dao;

import com.booklib.entity.Author;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
        return sessionFactory.getCurrentSession().createQuery("from Author").list();
    }

    @Override
    public Author findAuthorById(Long id) {
        return sessionFactory.getCurrentSession().get(Author.class, id);
    }

}
