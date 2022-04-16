package com.javaclub6.librarywebapp.dao;

import java.util.List;

import com.javaclub6.librarywebapp.model.User;

public interface UserDao {
    void save(User user);

    List<User> list();
}
