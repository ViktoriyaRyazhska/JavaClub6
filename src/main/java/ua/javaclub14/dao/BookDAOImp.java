package ua.javaclub14.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.javaclub14.model.Book;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDAOImp implements BookDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
        System.out.println("Book DAO list work");
        return query.getResultList();
    }

//    @Override
//    public List<Book> listByTitle(String title) {
//        @SuppressWarnings("unchecked")
//        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where title like : title");
//        query.setParameter("title",title);
//        return query.getResultList();
//    }

    @Override
    public List<Book> findBookByTitle(String title) {

        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where title like :title");
        query.setParameter("title",title);
        System.out.println("Book DAO work");
        return query.getResultList();
    }

//    @Override
//    public Book findBookById(Long id) {
//        return sessionFactory.getCurrentSession().get(Book.class, id);
//    }
}
