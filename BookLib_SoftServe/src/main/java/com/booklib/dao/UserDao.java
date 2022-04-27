package com.booklib.dao;

import com.booklib.entity.User;
import com.booklib.entity.Roles;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

public interface UserDao  {

    void save(User user);

    List<User> list();

    User findByEmail(String email);

    User findByUsername(String username);
}
