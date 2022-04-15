package team6.library.javaclub6.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import team6.library.javaclub6.model.User;

public interface UserService extends UserDetailsService {
    User findById(int id);
    User findByEmail(String email);
    void save(User user);
}
