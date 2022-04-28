package com.library.dao.impl;

import com.library.dao.RoleDAO;
import com.library.model.Role;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDAOImpl implements RoleDAO {
    @Autowired
    SessionFactory sessionFactory;
    @Override
    public Role findByTitle(String s) {

        Query query = sessionFactory.getCurrentSession().createQuery("from Role where title=:title");
        query.setParameter("title",s);
        Role role = (Role) query.uniqueResult();
        return role;
    }
}
