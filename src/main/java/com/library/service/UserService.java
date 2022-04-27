package com.library.service;

import com.library.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> findAll();
    User findByEmail(String email);
    User findById(long id);
    void deleteUser(User user);
}
