package com.library.dao;

import com.library.model.Request;

import java.time.LocalDate;
import java.util.List;

public interface RequestDAO {

    List<Request> findAll();
    Request findById(Long id);
    List<Request> findByBookId(Long bookId);
    List<Request> findByUserId(Long bookId);
    List<Request> findByDateRange(LocalDate startDate, LocalDate endDate);

}
