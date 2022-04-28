package ua.javaclub14.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.javaclub14.model.Book;
import ua.javaclub14.model.BookUser;

import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@Repository
public class BookUserDAOImp implements BookUserDAO{
   @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<BookUser> listByDate(Date start,Date finish) {

        @SuppressWarnings("unchecked")
        TypedQuery<BookUser> query = sessionFactory.getCurrentSession().createQuery("from BookUser where startDate between :start and :finish");
        query.setParameter("start", start);
        query.setParameter("finish",finish);
        return query.getResultList();
    }
}
