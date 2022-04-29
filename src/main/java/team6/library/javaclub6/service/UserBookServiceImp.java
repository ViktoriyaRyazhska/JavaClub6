package team6.library.javaclub6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.dao.UserBookDao;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.model.UserBook;

import java.sql.Date;
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
    public List<UserBook> hasReadBookList() {
        return userBookDao.hasReadBookList();
    }

    @Transactional
    public List<UserBook> list() {
        return userBookDao.list();
    }

    @Transactional
    public int getNumberOfBookGivenInSelectedPeriod(Date first, Date second) {
        List<UserBook> userBooks = list();
        int result = 0;
        for (UserBook i:userBooks){
            if (i.getFkStatus().getId() == 1 && i.getRentDate().compareTo(first) >= 0 && i.getRentDate().compareTo(second) <= 0) {
                result++;
            }
        }
        return result;
    }

    @Transactional
    public int getNumberOfRequestsInSelectedPeriod(Date first, Date second) {
        List<UserBook> userBooks = list();
        int result = 0;
        for (UserBook i:userBooks){
            if (i.getRentDate().compareTo(first) >= 0 && i.getRentDate().compareTo(second) <= 0) {
                result++;
            }
        }
        return result;
    }


}
