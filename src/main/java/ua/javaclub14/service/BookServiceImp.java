package ua.javaclub14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.javaclub14.dao.BookDAO;
import ua.javaclub14.model.Author;
import ua.javaclub14.model.Book;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookServiceImp implements BookService {
    @Autowired
    private BookDAO bookDAO;

//    public void setBookDAO(BookDAO bookDAO){
//        this.bookDAO=bookDAO;
//    }


    @Override
    public List<Book> findBookByTitle(String title) {

        return bookDAO.findBookByTitle(title);
    }

    @Override
    public List<Book> list() {

        return bookDAO.list();
    }



    @Override
    public void addBook(Book book) {
        System.out.println("Service add Book work");
        bookDAO.addBook(book);
//    this.bookDAO.addBook(book);
    }


    @Override
    public void deleteBook(Book book) { bookDAO.deleteBook(book); }

    @Override
    public Book findBookById(Long id) {
        return bookDAO.findBookById(id);
    }

}
