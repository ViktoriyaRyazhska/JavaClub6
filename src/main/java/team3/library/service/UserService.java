package team3.library.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import team3.library.model.User;
import team3.library.model.UserBook;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findById(int id);
    User findByEmail(String email);
    void save(User user);
    void update(User user);
    List<UserBook> getUserBooks(User user);
    List<UserBook> getHistory(User user);
}
