package com.booklib.service;

import com.booklib.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import com.booklib.dao.RequestDao;
import com.booklib.entity.Request;

@Service
public class RequestServiceImp implements RequestService {
    @Autowired
    private RequestDao requestDao;

    @Override
    @Transactional(readOnly = true)
    public List<Request> listByUser(Long id) {
        return requestDao.listByUser(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Request> list() {
        return requestDao.list();
    }

    @Override
    @Transactional
    public void save(Request request) {
        requestDao.save(request);
    }

    @Override
    @Transactional
    public List<Request> getCurrentReaders() {
        return requestDao.getCurrentReaders();
    }

}
