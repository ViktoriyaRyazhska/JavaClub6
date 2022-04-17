package team6.library.javaclub6.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.RequestStatus;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.model.UserBook;

@Repository
public class UserBookDaoImp implements UserBookDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void newRequest(Book book, User user) {
        UserBook userBook = new UserBook();
        userBook.setFkBook(book);
        userBook.setFkUser(user);
        userBook.setFkStatus(sessionFactory.getCurrentSession().get(RequestStatus.class, 3));
        sessionFactory.getCurrentSession().persist(userBook);
    }
}
