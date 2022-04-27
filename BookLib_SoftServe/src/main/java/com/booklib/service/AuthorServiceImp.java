package com.booklib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.booklib.dao.AuthorDao;
import com.booklib.entity.Author;

@Service
public class AuthorServiceImp implements AuthorService {

    @Autowired
    private AuthorDao authorDao;

    @Override
    @Transactional(readOnly = true, rollbackFor = { java.lang.Exception.class })
    public Author findAuthorBySurname(String name) {
        return authorDao.findAuthorBySurname(name);
    }

    @Override
    @Transactional(readOnly = true, rollbackFor = { java.lang.Exception.class })
    public List<Author> findAll() {
        return authorDao.findAll();
    }

    @Override
    @Transactional(readOnly = true, rollbackFor = { java.lang.Exception.class })
    public Author findAuthorById(Long id) {
        return authorDao.findAuthorById(id);
    }
}
