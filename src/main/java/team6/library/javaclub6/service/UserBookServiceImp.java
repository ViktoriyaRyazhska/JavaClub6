package team6.library.javaclub6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.dao.UserBookDao;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;

@Service
public class UserBookServiceImp implements UserBookService{

    @Autowired
    UserBookDao userBookDao;

    @Transactional
    public void newRequest(Book book, User user) {
        userBookDao.newRequest(book, user);
    }
}
