package team6.library.javaclub6.service;

import team6.library.javaclub6.dao.BookDao;
import team6.library.javaclub6.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookDao bookDao;

    @Transactional(readOnly = true)
    public List<Book> list() {
        return bookDao.list();
    }

    @Transactional
    public Book findById(int id) {
        return bookDao.findById(id);
    }

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }
}