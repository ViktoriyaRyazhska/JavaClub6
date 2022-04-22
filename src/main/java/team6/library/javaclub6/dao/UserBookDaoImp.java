package team6.library.javaclub6.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.RequestStatus;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.model.UserBook;

import javax.persistence.TypedQuery;
import java.sql.Date;
import java.util.List;

@Repository
public class UserBookDaoImp implements UserBookDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void newRequest(Book book, User user) {
        UserBook userBook = new UserBook();
        userBook.setFkBook(book);
        userBook.setFkUser(user);
        userBook.setFkStatus(sessionFactory.getCurrentSession().get(RequestStatus.class, 3));
        sessionFactory.getCurrentSession().persist(userBook);
    }

    @Transactional
    public void returnBook(UserBook userBook) {
        userBook.setReturnDate(new Date(System.currentTimeMillis()));
        sessionFactory.getCurrentSession().update(userBook);
    }

    @Override
    public List<UserBook> list() {
        TypedQuery<UserBook> query = sessionFactory.getCurrentSession().createQuery("from UserBook");
        return query.getResultList();
    }
}
