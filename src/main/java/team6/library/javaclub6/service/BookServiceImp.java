package team6.library.javaclub6.service;

import team6.library.javaclub6.dao.BookDao;
import team6.library.javaclub6.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.model.UserBook;

import java.util.*;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookDao bookDao;

    @Autowired
    private UserBookService userBookService;


    @Transactional(readOnly = true)
    public List<Book> list() {
        return bookDao.list();
    }

    @Transactional
    public Book findById(int id) {
        return bookDao.findById(id);
    }

    @Transactional
    public void save(Book book) {
        bookDao.save(book);
    }

    @Transactional
    public List<Book> popularList(int year, int month) {
        Date selectedPeriodStart = new Date(year, month, 1);
        Date selectedPeriodEnd = new Date(year, month + 1, 1);
        List<UserBook> userBooks = userBookService.list();
        List<Book> result = new ArrayList<>();
        HashMap<Book, Integer> map = new HashMap<>();
        for(UserBook i:userBooks){
            if (i.getRentDate().compareTo(selectedPeriodEnd) < 0 && i.getRentDate().compareTo(selectedPeriodStart) >= 0){
                if (map.containsKey(i.getFkBook())) {
                    map.replace(i.getFkBook(), map.get(i.getFkBook()), map.get(i.getFkBook()) + 1);
                } else {
                    map.put(i.getFkBook(), 1);
                    result.add(i.getFkBook());
                }
            }
        }
        result.sort(Comparator.comparingInt(map::get));
        Collections.reverse(result);
        return result.subList(0, 5);
    }

    @Transactional
    public List<Book> findByTitle(String title) {
        return bookDao.findByTitle(title);
    }
}