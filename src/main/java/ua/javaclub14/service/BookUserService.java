package ua.javaclub14.service;

import ua.javaclub14.model.BookUser;

import java.util.Date;
import java.util.List;

public interface BookUserService {
    List<BookUser> listByDate(Date start, Date finish);
}
