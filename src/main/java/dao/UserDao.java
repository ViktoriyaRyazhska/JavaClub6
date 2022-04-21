package dao;

import model.User;

import java.util.List;

public interface UserDao {
    void save(User user);
    List<User> list();
}
