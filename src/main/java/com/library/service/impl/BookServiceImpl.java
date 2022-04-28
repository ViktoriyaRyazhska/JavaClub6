package com.library.service.impl;

import com.library.dao.BookDAO;
import com.library.model.Author;
import com.library.model.Book;
import com.library.model.Request;
import com.library.service.BookService;
import com.library.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    @Autowired
    private RequestService requestService;

    @Autowired
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public void addBook(Book book) {
        bookDAO.addBook(book);
    }

    @Override
    @Transactional
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    @Transactional
    public List<Book> popularBooks() {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusMonths(1);
        List<Request> requests = requestService.findByDateRange(startDate, endDate);
        HashMap<Book, Integer> times = new HashMap<>();
        for (Request request : requests) {
            if (times.containsKey(request.getBook())) {
                times.replace(request.getBook(), times.get(request.getBook()), times.get(request.getBook()) + 1);
            } else {
                times.put(request.getBook(), 1);
            }
        }
        LinkedHashMap<Book, Integer> sortedTimes = new LinkedHashMap<>();
        times
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(value -> sortedTimes.put(value.getKey(), value.getValue()));
        Set<Book> booksSet = sortedTimes.keySet();
        return new ArrayList<>(booksSet);
    }

    @Override
    @Transactional
    public Book findBookById(Long id) {
        return bookDAO.findBookById(id);
    }

    @Override
    @Transactional
    public List<Book> findBookByTitle(String title) {
        return bookDAO.findBookByTitle(title);
    }

    @Override
    public List<Book> findBookByAuthor(Author author) {
        return bookDAO.findBookByAuthor(author);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        bookDAO.updateBook(book);
    }

    @Override
    @Transactional
    public void deleteBook(Book book) {
        bookDAO.deleteBook(book);
    }

    @Override
    @Transactional
    public Integer getNotReturned(Book book) {
        List<Request> requests = requestService.findByBookId(book.getBookId());
        Integer notReturned = 0;
        for (Request request : requests) {
            if (request.getReturnDate() == null) {
                notReturned++;
            }
        }
        return notReturned;
    }

}
