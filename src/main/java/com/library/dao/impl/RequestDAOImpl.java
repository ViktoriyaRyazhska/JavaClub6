package com.library.dao.impl;

import com.library.dao.RequestDAO;
import com.library.model.Book;
import com.library.model.Request;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository
@Transactional
@EnableTransactionManagement
public class RequestDAOImpl implements RequestDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Request> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from Request").list();
    }

    @Override
    public Request findById(Long id) {
        return sessionFactory.getCurrentSession().get(Request.class, id);
    }

    @Override
    public List<Request> findByBookId(Long bookId) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Request where book_id=:bookId");
        query.setParameter("bookId", bookId);
        return query.list();
    }

    @Override
    public List<Request> findByUserId(Long userId) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Request where user_id=:userId");
        query.setParameter("userId", userId);
        return query.list();
    }

    @Override
    public List<Request> findByDateRange(LocalDate startDate, LocalDate endDate) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Request where request_date between :startDate and :endDate");
        query.setParameter("startDate", startDate);
        query.setParameter("endDate", endDate);
        return query.list();
    }

    @Override
    public void createRequest(Request request) {
        sessionFactory.getCurrentSession().save(request);
    }

    @Override
    public void updateRequest(Request request) {
        sessionFactory.getCurrentSession().update(request);
    }
}
