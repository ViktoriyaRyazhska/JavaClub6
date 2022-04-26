package com.booklib.dao;

import com.booklib.entity.Request;
import com.booklib.entity.User;

import java.util.Date;
import java.util.List;

public interface RequestDao {
    List<Request> list();

    List<Request> listByUser(Long id);

    void save(Request request);

    List<Request> getCurrentReaders();

    long getGivenBooksWithinPeriod(Date from, Date to);
}
