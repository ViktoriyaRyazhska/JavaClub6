package team6.library.javaclub6.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.model.Author;

import javax.persistence.TypedQuery;

@Repository
public class AuthorDaoImp implements AuthorDao {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public Author findByNameSurname(String name, String surname) {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Author WHERE name=: name AND surname=: surname");
        query.setParameter("name", name);
        query.setParameter("surname", surname);
        return (Author) query.uniqueResult();
    }

    @Override
    public boolean finaByNameSurnameBool(String name, String surname) {

        Query query = sessionFactory.getCurrentSession().createQuery("FROM Author WHERE name=: name AND surname=: surname");
        query.setParameter("name", name);
        query.setParameter("surname", surname);
        if (query.getResultList().isEmpty()){
            return false;
        } else {
            return true;
        }
    }

    @Transactional
    public void saveAuthor(Author author) {
        sessionFactory.getCurrentSession().persist(author);
    }

}
