package team3.library.dao;

import team3.library.model.User;

public interface UserDao {
    User findById(int id);
    User findByEmail(String email);
    void save(User user);
    void update(User user);
}
