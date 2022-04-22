package team6.library.javaclub6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.dao.UserBookDao;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.model.UserBook;

import java.util.List;

@Service
public class UserBookServiceImp implements UserBookService{

    @Autowired
    UserBookDao userBookDao;

    @Transactional
    public void newRequest(Book book, User user) {
        userBookDao.newRequest(book, user);
    }

    @Transactional
    public void returnBook(UserBook userBook) {
        userBookDao.returnBook(userBook);
    }

    @Transactional
    public List<UserBook> list() {
        return userBookDao.list();
    }


}
