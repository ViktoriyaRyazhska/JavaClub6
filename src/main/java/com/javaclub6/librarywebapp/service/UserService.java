package com.javaclub6.librarywebapp.service;

import java.util.List;

import com.javaclub6.librarywebapp.model.User;

public interface UserService {
    void save(User user);

    List<User> list();
}
