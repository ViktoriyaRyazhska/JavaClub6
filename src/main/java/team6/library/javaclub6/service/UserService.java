package team6.library.javaclub6.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.model.UserBook;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findById(int id);
    User findByEmail(String email);
    void save(User user);
    void update(User user);
    List<UserBook> getUserBooks(User user);
    List<UserBook> getHistory(User user);
}
