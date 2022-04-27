package com.library.dao;

import com.library.model.User;

import java.util.List;

public interface UserDAO {
    void save(User user);
    List<User> findAll();
    User findByEmail(String email);
    User findById(long id);
    void deleteUser(User user);
}
