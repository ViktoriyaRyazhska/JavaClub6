package com.library.service;

import com.library.model.User;

public interface UserService {
    void save(User user);
    User findByEmail(String email);
    User findById(long id);
    void deleteUser(User user);
}
