package com.booklib.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

import com.booklib.entity.Request;

import java.util.List;

@Repository
public class RequestDaoImp implements RequestDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Request> listByUser(Long id) {
        @SuppressWarnings("unchecked")
        TypedQuery<Request> query = sessionFactory.getCurrentSession()
                .createQuery("from Request where user_id like :id");
        query.setParameter("id", id);
        return query.getResultList();
    }

    @Override
    public List<Request> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Request> query = sessionFactory.getCurrentSession()
                .createQuery("from Request");
        return query.getResultList();
    }

    @Override
    public void save(Request request) {
        sessionFactory.getCurrentSession().save(request);

    }

}
