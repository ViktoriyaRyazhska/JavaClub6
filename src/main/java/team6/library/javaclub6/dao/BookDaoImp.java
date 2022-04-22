package team6.library.javaclub6.dao;

import org.springframework.beans.factory.annotation.Autowired;
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
        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where title is not null");
        return query.getResultList();
    }

    @Override
    public Book findById(int id) {
        Book result = sessionFactory.getCurrentSession().get(Book.class, id);
        return result;
    }
}