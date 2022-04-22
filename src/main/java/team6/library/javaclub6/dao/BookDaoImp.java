package team6.library.javaclub6.dao;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;
import team6.library.javaclub6.exception.BookNotFoundException;
import team6.library.javaclub6.model.Book;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDaoImp implements BookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Book> list() {
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
        return query.getResultList();
    }

    @Override
    public Book findById(int id) {
        Book result = sessionFactory.getCurrentSession().get(Book.class, id);
        return result;
    }

    @Override
    public void save(Book book) {
        sessionFactory.getCurrentSession().persist(book);
    }
}