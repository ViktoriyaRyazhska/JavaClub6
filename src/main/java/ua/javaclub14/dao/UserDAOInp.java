package ua.javaclub14.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.javaclub14.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDAOInp implements UserDAO{
    @Autowired
    private SessionFactory sessionFactory;

//    @Override
//    public void save(User user) {
//        sessionFactory.getCurrentSession().save(user);
//    }

    @Override
    public List<User> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }
}
