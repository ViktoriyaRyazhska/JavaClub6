package com.booklib.dao;

import com.booklib.entity.Request;

import java.util.List;

public interface RequestDao {
    List<Request> list();

    List<Request> listByUser(Long id);

    void save(Request request);
}
