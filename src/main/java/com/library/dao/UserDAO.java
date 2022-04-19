package com.library.dao;

import com.library.model.User;

public interface UserDAO {
    void save(User user);
    User findByEmail(String email);
    User findById(long id);
    void deleteUser(User user);
}
