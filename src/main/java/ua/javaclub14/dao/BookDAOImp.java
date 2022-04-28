package ua.javaclub14.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.javaclub14.model.Author;
import ua.javaclub14.model.Book;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDAOImp implements BookDAO{

    @Autowired
    private SessionFactory sessionFactory;

//    public void setSessionFactory(SessionFactory sessionFactory){
//        this.sessionFactory=sessionFactory;
//    }

    @Override
    public List<Book> list() {
        @SuppressWarnings("unchecked")
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
        return query.getResultList();
    }




    @Override
    public List<Book> findBookByTitle(String title) {

        @SuppressWarnings("unchecked")

        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where title like :title");
        query.setParameter("title", title);
        return query.getResultList();
    }

    @Override
    public void addBook(Book book) {

//        Session session=this.sessionFactory.getCurrentSession();
//        session.persist(book);
        sessionFactory.getCurrentSession().save(book);
    }

    @Override
    public void deleteBook(Book book) {sessionFactory.getCurrentSession().delete(book); }

    @Override
    public Book findBookById(Long id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }
}
