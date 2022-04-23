package team6.library.javaclub6.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import team6.library.javaclub6.model.Author;

@Repository
public class AuthorDaoImp implements AuthorDao {
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Author findByNameSurname(String name, String surname) {
        Query query = sessionFactory.getCurrentSession().createQuery("FROM Author WHERE name=: name AND surname=: surname");
        query.setParameter("name", name);
        query.setParameter("surname", surname);
        Author result = (Author) query.getResultList();
        return result;
    }

}
