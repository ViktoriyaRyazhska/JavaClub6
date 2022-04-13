package team6.library.javaclub6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import team6.library.javaclub6.pojo.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Author.class);
        configuration.addAnnotatedClass(AuthorBook.class);
        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(RequestStatus.class);
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(UserBook.class);
        configuration.addAnnotatedClass(UserRole.class);
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sf = configuration.buildSessionFactory(ssrb.build());
        //Create user

        /*Session sessionCreate = sf.openSession();
        Transaction transactionCreate = sessionCreate.beginTransaction();
        sessionCreate.save(author);
        transactionCreate.commit();
        sessionCreate.close();
        */
        Session sessionRead = sf.openSession();
        Transaction transactionRead = sessionRead.beginTransaction();
        List<Book> books = sessionRead.createQuery("from Book", Book.class).list();
        for (Book b: books) {
            System.out.println(b.toString());
        }
        transactionRead.commit();
        sessionRead.close();
    }
}
