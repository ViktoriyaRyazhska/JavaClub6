package com.booklib.service;

import java.util.List;

import com.booklib.entity.Request;

public interface RequestService {
    List<Request> list();

    List<Request> listByUser(Long id);

    void save(Request request);
}
