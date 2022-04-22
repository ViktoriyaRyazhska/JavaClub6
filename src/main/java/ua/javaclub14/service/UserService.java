package ua.javaclub14.service;

import ua.javaclub14.model.User;

import java.util.List;

public interface UserService {
    void save(User user);

    List<User> list();
}
