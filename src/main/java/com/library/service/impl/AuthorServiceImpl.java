package com.library.service.impl;

import com.library.dao.AuthorDAO;
import com.library.model.Author;
import com.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorDAO authorDAO;

    @Override
    @Transactional
    public void addAuthor(Author author) {
        authorDAO.addAuthor(author);
    }

    @Override
    @Transactional
    public List<Author> findAll() {
        return authorDAO.findAll();
    }

    @Override
    @Transactional
    public Author findAuthorById(Long id) {
        return authorDAO.findAuthorById(id);
    }
}
