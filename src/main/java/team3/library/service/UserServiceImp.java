package team3.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.library.model.Role;
import team3.library.dao.UserDao;
import team3.library.model.User;
import team3.library.model.UserBook;
import team3.library.model.UserRole;
import team6.library.javaclub6.model.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Transactional(readOnly = true)
    public User findById(int id){
        return userDao.findById(id);
    }

    @Transactional(readOnly = true)
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = findByEmail(username);
        if (user == null){
            throw new UsernameNotFoundException(String.format("User '%s' not found.", username));
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), mapRolesToAuthorities(user.getRoles().stream().map(UserRole::getFkRole).collect(Collectors.toList())));
    }

    private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles){
        return roles.stream().map(r -> new SimpleGrantedAuthority(r.getName())).collect(Collectors.toList());
    }

    @Transactional
    public void update(User user){
        userDao.update(user);
    }

    @Transactional
    public List<UserBook> getUserBooks(User user){
        List<UserBook> userBooks = new ArrayList<>();
        for (UserBook i:user.getBooks()) {
            if (i.getFkStatus().getId() == 1){
                if (i.getReturnDate() == null){
                    userBooks.add(i);
                }
            }
        }
        userBooks.sort(Comparator.comparing(UserBook::getShouldReturnDate));
        return userBooks;
    }
    @Transactional
    public List<UserBook> getHistory(User user){
        List<UserBook> userBooks = new ArrayList<>();
        for (UserBook i:user.getBooks()) {
            if (i.getReturnDate() != null){
                userBooks.add(i);
            }
        }
        userBooks.sort(Comparator.comparing(UserBook::getRentDate));
        return userBooks;
    }
}
