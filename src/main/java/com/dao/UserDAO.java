package com.dao;

import com.model.User;

public interface UserDAO {
    void save(User user);
    User findByEmail(String email);
    User findById(Long id);
    void deleteUser (User user);
}
