package com.booklib.service;

import com.booklib.dao.RolesDao;
import com.booklib.dao.UserDao;
import com.booklib.entity.Roles;
import com.booklib.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService, UserDetailsService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RolesDao rolesDao;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Roles findRole(Long id) {
        return rolesDao.findRole(id);
    }

    @Transactional
    public void save(User user) {
        User userForSave = new User();
        userForSave.setName(user.getName());
        userForSave.setSurname(user.getSurname());
        userForSave.setUsername(user.getUsername());
        userForSave.setPassword(passwordEncoder.encode(user.getPassword()));
        userForSave.setEmail(user.getEmail());
        userForSave.setBirthday(user.getBirthday());
        userForSave.setDate_registr(new Date(System.currentTimeMillis()));
        userForSave.setRoles(rolesDao.findByRole("ROLE_USER"));

        userDao.save(userForSave);
    }

    @Transactional(readOnly = true)
    public List<User> list() {
        return userDao.list();
    }

    @Override
    @Transactional(readOnly = true)
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findByUsername(username);
    }
}