package team3.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.library.dao.UserBookDao;
import team3.library.model.Book;
import team3.library.model.User;
import team3.library.model.UserBook;

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

    @Override
    public List<UserBook> hasReadBookList() {
        return userBookDao.hasReadBookList();
    }

    @Transactional
    public List<UserBook> list() {
        return userBookDao.list();
    }


}
