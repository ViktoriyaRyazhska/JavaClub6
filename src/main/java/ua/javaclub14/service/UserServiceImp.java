package ua.javaclub14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.javaclub14.dao.UserDAO;
import ua.javaclub14.model.User;

import java.util.List;
@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserDAO userDao;

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    public List<User> list() {
        return userDao.list();
    }
}
