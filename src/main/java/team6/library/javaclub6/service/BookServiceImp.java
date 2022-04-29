package team6.library.javaclub6.service;

import team6.library.javaclub6.dao.BookDao;
import team6.library.javaclub6.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.model.UserBook;

import java.sql.Date;
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
    public void update(Book book) {
        bookDao.update(book);
    }

    @Transactional
    public List<Book> popularList(int year, int month) {
        Date selectedPeriodStart = new Date(year, month, 1);
        Date selectedPeriodEnd = new Date(year, month + 1, 1);
        List<UserBook> userBooks = userBookService.list();
        List<Book> result = new ArrayList<>();
        HashMap<Book, Integer> map = new HashMap<>();
        for(UserBook i:userBooks){
            if(i.getRentDate() != null){
            if (i.getRentDate().compareTo(selectedPeriodEnd) < 0 && i.getRentDate().compareTo(selectedPeriodStart) >= 0) {
                if (map.containsKey(i.getFkBook())) {
                    map.replace(i.getFkBook(), map.get(i.getFkBook()), map.get(i.getFkBook()) + 1);
                } else {
                    map.put(i.getFkBook(), 1);
                    result.add(i.getFkBook());
                }
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

    @Transactional
    public int getAverageTimeOfReading(int id) {
        List<UserBook> userBooks = userBookService.list();
        int number = 0;
        int sum = 0;
        for (UserBook i:userBooks) {
            if (i.getFkStatus().getId() == 1 && i.getFkBook().getId() == id && i.getReturnDate() != null) {
                number++;
                int millis = (int) (i.getReturnDate().getTime() - i.getRentDate().getTime());
                int days = millis / 1000 / 60 / 60 / 24;
                sum += days;
            }
        }
        if (number != 0) {
            return sum / number;
        }
        return 0;
    }
}