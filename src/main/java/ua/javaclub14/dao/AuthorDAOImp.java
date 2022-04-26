package ua.javaclub14.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.javaclub14.model.Author;


import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class AuthorDAOImp implements AuthorDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Author> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Author> query = sessionFactory.getCurrentSession().createQuery("from Author ");
        System.out.println("Author Service work");
        return query.getResultList();
    }

    @Override
    public Author findAuthorById(Long id) {
        return sessionFactory.getCurrentSession().get(Author.class, id);
    }

    @Override
    public void addAuthor(Author author) {
        sessionFactory.getCurrentSession().save(author);
    }

    @Override
    public void deleteAuthor(Author author) {sessionFactory.getCurrentSession().delete(author); }
}
