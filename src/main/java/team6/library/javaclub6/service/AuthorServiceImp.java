package team6.library.javaclub6.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team6.library.javaclub6.dao.AuthorDao;
import team6.library.javaclub6.model.Author;

@Service
public class AuthorServiceImp implements AuthorService {
    @Autowired
    private AuthorDao authorDao;

    @Transactional
    public Author findByNameSurname(String name, String surname) {
        return authorDao.findByNameSurname(name, surname);
    }
}
