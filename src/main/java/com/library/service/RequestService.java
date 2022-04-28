package com.library.service;

import com.library.model.Request;

import java.time.LocalDate;
import java.util.List;

public interface RequestService {

    List<Request> findAll();
    Request findById(Long id);
    List<Request> findByBookId(Long bookId);
    List<Request> findByUserId(Long userId);
    List<Request> findByDateRange(LocalDate startDate, LocalDate endDate);
    void createRequest(Request request);

    void updateRequest(Request request);

}
