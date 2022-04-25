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

//    @Override
//    public Book findBookById(Long id) {
//        return bookDAO.findBookById(id);
//    }

    @Override
    public List<Book> list() {
        return (List<Book>) bookDAO.list();
    }
}
