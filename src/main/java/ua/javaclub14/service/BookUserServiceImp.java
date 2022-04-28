package ua.javaclub14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.javaclub14.dao.BookUserDAO;
import ua.javaclub14.model.BookUser;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class BookUserServiceImp implements BookUserService{
    @Autowired
    private BookUserDAO bookUserDAO;

    @Override
    public List<BookUser> listByDate(Date start, Date finish) {
        return bookUserDAO.listByDate(start,finish);
    }
}
