package com.booklib.service;

import com.booklib.entity.Roles;
import com.booklib.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> list();

    User findByEmail(String email);

    Roles findRole(Long id);
}
