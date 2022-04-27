package team6.library.javaclub6.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.model.Author;
import team6.library.javaclub6.model.AuthorBook;
import team6.library.javaclub6.model.Book;

@Repository
public class AuthorBookDaoImp implements AuthorBookDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public void newAuthorBook(Book book, Author author) {
        AuthorBook authorBook = new AuthorBook();
        authorBook.setFkBook(book);
        authorBook.setFkAuthor(author);
        sessionFactory.getCurrentSession().persist(authorBook);
    }
}
