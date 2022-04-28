package team3.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import team3.library.dao.AuthorDao;
import team3.library.model.Author;

@Service
public class AuthorServiceImp implements AuthorService {
    @Autowired
    private AuthorDao authorDao;

    @Transactional
    public Author findByNameSurname(String name, String surname) {
        return authorDao.findByNameSurname(name, surname);
    }

    @Transactional
    public boolean finaByNameSurnameBool(String name, String surname) {
        return authorDao.finaByNameSurnameBool(name, surname);
    }

    @Transactional
    public void saveAuthor(Author author) {
        authorDao.saveAuthor(author);
    }
}
