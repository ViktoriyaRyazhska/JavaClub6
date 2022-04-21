package ua.javaclub14.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.javaclub14.dao.AuthorDAO;
import ua.javaclub14.model.Author;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AuthorServiceImp implements AuthorService{

    @Autowired
    private AuthorDAO authorDAO;

    @Override
    public List<Author> list() {

        return (List<Author>) authorDAO.list();
    }
}
