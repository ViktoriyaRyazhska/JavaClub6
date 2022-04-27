package ua.javaclub14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.javaclub14.dao.BookDAO;
import ua.javaclub14.model.Book;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BookServiceImp implements BookService {
    @Autowired
    private BookDAO bookDAO;


    @Override
    public List<Book> findBookByTitle(String title) {
        System.out.println("findBookByTitle Service list work");
        return bookDAO.findBookByTitle(title);
    }

    @Override
    public List<Book> list() {
        System.out.println("Book Service list work");
        return (List<Book>) bookDAO.list();
    }



    @Override
    public void addBook(Book book) {
        bookDAO.addBook(book);

    }



}
