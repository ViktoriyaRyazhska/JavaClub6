package team6.library.javaclub6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import team6.library.javaclub6.pojo.Author;

public class App {
    public static void main(String[] args) {
        Author author = new Author();
        author.setAuthor_name("Lina");
        author.setAuthor_surname("Kostenko");

        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Author.class);
        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sf = configuration.buildSessionFactory(ssrb.build());

        //Create user

        /*Session sessionCreate = sf.openSession();
        Transaction transactionCreate = sessionCreate.beginTransaction();
        sessionCreate.save(author);
        transactionCreate.commit();
        sessionCreate.close();
        */
        //Read user
        Session sessionRead = sf.openSession();
        Transaction transactionRead = sessionRead.beginTransaction();
        Author author1 = sessionRead.find(Author.class, 3);
        System.out.println(author1.toString());
        transactionRead.commit();
        sessionRead.close();
    }
}
