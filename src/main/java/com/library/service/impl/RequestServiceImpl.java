package com.library.service.impl;

import com.library.dao.RequestDAO;
import com.library.model.Request;
import com.library.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
public class RequestServiceImpl implements RequestService {

    @Autowired
    private RequestDAO requestDAO;

    @Override
    public List<Request> findAll() {
        return requestDAO.findAll();
    }

    @Override
    public Request findById(Long id) {
        return requestDAO.findById(id);
    }

    @Override
    public List<Request> findByBookId(Long bookId) {
        return requestDAO.findByBookId(bookId);
    }

    @Override
    @Transactional
    public List<Request> findByUserId(Long userId) {
        return requestDAO.findByUserId(userId);
    }

    @Override
    public List<Request> findByDateRange(LocalDate startDate, LocalDate endDate) {
        return requestDAO.findByDateRange(startDate, endDate);
    }

    @Override
    public void createRequest(Request request) {
        requestDAO.createRequest(request);
    }

    @Override
    @Transactional
    public void updateRequest(Request request){
        requestDAO.updateRequest(request);
    }
}
