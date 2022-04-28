package team3.library.dao;

import team3.library.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImp implements UserDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public User findById(int id){
        return sessionFactory.getCurrentSession().get(User.class, id);
    }

    @Override
    public User findByEmail(String email) {
        Query query = sessionFactory.getCurrentSession().createQuery("from User where email=:email");
        query.setParameter("email", email);
        User result = (User) query.uniqueResult();
        return result;
    }

    @Override
    public void save(User user) {
        sessionFactory.getCurrentSession().persist(user);
    }
    @Override
    public void update(User user) {
        sessionFactory.getCurrentSession().update(user);
    }
}
