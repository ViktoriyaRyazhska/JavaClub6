package com.booklib.dao;

import com.booklib.entity.Roles;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.persistence.TypedQuery;

@Repository
public class RolesDaoImpl implements RolesDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Roles findRole(Long id) {
        @SuppressWarnings("unchecked")
        TypedQuery<Roles> query = sessionFactory.getCurrentSession().createQuery("from Roles where id like :id");
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    @Override
    public Roles findByRole(String role) {
        TypedQuery<Roles> query = sessionFactory.getCurrentSession().createQuery("from Roles where role like :role");
        query.setParameter("role", role);
        return query.getSingleResult();
    }
}
