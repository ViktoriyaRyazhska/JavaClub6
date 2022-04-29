package team6.library.javaclub6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.dao.UserDao;
import team6.library.javaclub6.model.*;

import java.sql.Date;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserBookService userBookService;

    @Autowired
    private RoleService roleService;

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

    @Transactional
    public List<UserBook> getRequestList(User user) {
        List <UserBook> userBooks = user.getBooks();
        userBooks.removeIf(i -> i.getFkStatus().getId() == 1);
        return userBooks;
    }

    @Transactional
    public List<User> getUserMissedReturnDate() {
        List<User> users = new ArrayList<>();
        List<UserBook> userBooks = userBookService.list();
        for (UserBook i:userBooks){
            if (i.getFkStatus().getId() == 1){
                if (i.getReturnDate() == null){
                    if (i.getShouldReturnDate().compareTo(new Date(System.currentTimeMillis())) < 0) {
                        users.add(i.getFkUser());
                    }
                } else {
                    if (i.getShouldReturnDate().compareTo(i.getReturnDate()) < 0){
                        users.add(i.getFkUser());
                    }
                }
            }
        }
        return users;
    }

    @Transactional
    public List<User> list() {
        return userDao.list();
    }

    @Transactional
    public List<User> getReadersList() {
        List<User> users = userDao.list();
        List<User> admins = new ArrayList<>();
        Role admin = roleService.findById(1);
        for (User i:users) {
            for (UserRole j:i.getRoles()){
                if (j.getFkRole().equals(admin)) {
                    admins.add(i);
                    break;
                }
            }
        }
        users.removeAll(admins);
        return users;
    }



    @Transactional
    public int getAverageAgeOfReaders() {
        List<User> users = getReadersList();
        int sum = 0;
        for (User i:users) {
            sum += getAgeOfUser(i);
        }
        return sum / users.size();
    }

    @Transactional
    public int getTimeWorkingWithLibrary(User user) {
        return new Date(System.currentTimeMillis() - user.getRegistrationDate().getTime()).getYear() - 70;
    }

    @Transactional
    public int getAgeOfUser(User user) {
        return new Date(System.currentTimeMillis() - user.getBirthDate().getTime()).getYear() - 70;
    }
}
