package ua.javaclub14.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.javaclub14.model.Author;
import ua.javaclub14.model.Book;

import javax.persistence.TypedQuery;
import java.text.SimpleDateFormat;
import java.util.Date;
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

        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where title like  :title ");
        query.setParameter("title", title);
        return query.getResultList();
    }

    @Override
    public void addBook(Book book) {
        System.out.println("addBook DAO working");
//        sessionFactory.getCurrentSession().save(book);



//        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("insert into Book (title," +
//                "realizeYear,inReading,lastUpdate,totalQuantity,roleId) values (:title,:realizeYear,0,date,:totalQuantity,:roleId)");
//        query.setParameter("title", title);
//        query.setParameter("realizeYear", realizeYear);
//        query.setParameter("totalQuantity", totalQuantity);
//        query.setParameter("roleId", roleId);
//        return query.getResultList();
        Date date = new Date(System.currentTimeMillis());
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        TypedQuery<Book> insertQuery = session.createSQLQuery( "INSERT INTO Book (title,realizeYear,inReading,lastUpdate,totalQuantity,roleId)VALUES(?,?,0,?,?,?)");


        insertQuery.setParameter(1, book.getTitle());
        insertQuery.setParameter(2, book.getRealizeYear());
        insertQuery.setParameter(3, book.getInReading());
        insertQuery.setParameter(4, date);
        insertQuery.setParameter(5, book.getRoleId());
        System.out.println("addBook DAO query");
        insertQuery.executeUpdate();
        System.out.println("addBook DAO finish");
        session.getTransaction().commit();

    }


    @Override
    public void deleteBook(Book book) {sessionFactory.getCurrentSession().delete(book); }

    @Override
    public Book findBookById(Long id) {
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public List<Book> findBookByPopular() {
        @SuppressWarnings("unchecked")

        TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book where inReading>0 order by inReading desc ");

        return query.getResultList();
    }


}
