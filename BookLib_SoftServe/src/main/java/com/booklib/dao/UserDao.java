package com.booklib.dao;

import com.booklib.entity.User;
import com.booklib.entity.Roles;

import java.util.List;

public interface UserDao {

    void save(User user);

    List<User> list();

    User findByEmail(String email);

    Roles findRole(Long id);
}
