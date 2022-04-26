package com.booklib.service;

import com.booklib.dao.UserDao;
import com.booklib.entity.Roles;
import com.booklib.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Roles findRole(Long id) {
        return userDao.findRole(id);
    }

    @Transactional
    public void save(User user) {
        // Roles role = userDao.findRole(new Long(2));
        // user.setRoles(role);
        // user.setDate_registr(new Date());
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    public List<User> list() {
        return userDao.list();
    }

    @Override
    @Transactional(readOnly = true)
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }
}