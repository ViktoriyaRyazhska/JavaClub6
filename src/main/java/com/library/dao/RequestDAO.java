package com.library.dao;

import com.library.model.Request;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Transactional
public interface RequestDAO {

    List<Request> findAll();
    Request findById(Long id);
    List<Request> findByBookId(Long bookId);
    List<Request> findByUserId(Long bookId);
    List<Request> findByDateRange(LocalDate startDate, LocalDate endDate);
    public void createRequest(Request request);

    void updateRequest(Request request);


}
