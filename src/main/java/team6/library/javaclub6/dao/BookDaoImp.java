package team6.library.javaclub6.dao;

import team6.library.javaclub6.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImp implements BookDao {

    private static final SessionFactory sessionFactory;

    static {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Book.class);
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        sessionFactory = configuration.buildSessionFactory(ssrb.build());
    }
    @Override
    public List<Book> list() {
        Session sessionRead = sessionFactory.openSession();
        Transaction transactionRead = sessionRead.beginTransaction();
        List<Book> books = sessionRead.createQuery("from Book", Book.class).list();
        transactionRead.commit();
        sessionRead.close();
        return books;
    }
}