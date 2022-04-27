package com.library.service;

import com.library.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;


public interface UserService extends UserDetailsService {
    void save(User user);

    List<User> findAll();
    User findByEmail(String email);
    User findById(long id);
    void deleteUser(User user);

    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
