package team6.library.javaclub6.dao;

import team6.library.javaclub6.model.Role;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImp implements RoleDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Role findById(int id){
        return sessionFactory.getCurrentSession().get(Role.class, id);
    }
}
