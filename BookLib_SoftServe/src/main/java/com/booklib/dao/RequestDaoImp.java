package com.booklib.dao;

import com.booklib.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;

import com.booklib.entity.Request;

import java.util.ArrayList;
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
    public List<User> getCurrentReaders() {
        //Select user.id, CONCAT(user.name, ' ', user.surname) as Name ,
        //user.date_registr, user.birthday, book.title as Book,
        //DATEDIFF(request.date_return, request.last_day) as OverdueDays,
        //request.last_day, request.date_return
        //from user, request, book
        //where user.id = request.user_id and request.book_id = book.id and OverdueDays > 0;

        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("select user from Request where DATEDIFF(date_return, last_day) > 0");

        return new ArrayList<>(new HashSet<>(query.getResultList()));
    }

}
