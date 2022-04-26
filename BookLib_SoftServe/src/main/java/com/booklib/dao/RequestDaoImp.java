package com.booklib.dao;

import com.booklib.entity.Book;
import com.booklib.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

import com.booklib.entity.Request;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
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

    @Override
    public List<Request> getCurrentReaders() {
        @SuppressWarnings("unchecked")
        TypedQuery<Request> query = sessionFactory.getCurrentSession()
                .createQuery("from Request where date_return = null");
        return query.getResultList();
    }

    @Override
    public long getGivenBooksWithinPeriod(Date from, Date to) {

        TypedQuery<Book> query = sessionFactory.getCurrentSession()
                .createQuery("select book from Request where date_return = null and " +
                        "DATEDIFF(:to, last_day) >= 0 and DATEDIFF(first_day, :from) >= 0");
        query.setParameter("to", to);
        query.setParameter("from", from);

        return new HashSet<>(query.getResultList()).size();
    }

}
