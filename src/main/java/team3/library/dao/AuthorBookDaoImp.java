package team3.library.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import team3.library.model.Author;
import team3.library.model.AuthorBook;
import team3.library.model.Book;

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
