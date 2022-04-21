package com.booklib.service;

import com.booklib.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> list();
}
