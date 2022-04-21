package team6.library.javaclub6.dao;

import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;

import java.util.List;

public interface UserDao {
    User findById(int id);
    User findByEmail(String email);
    void save(User user);
    void update(User user);
}
