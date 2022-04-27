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
        System.out.println("Author Service work");

        return (List<Author>) authorDAO.list();
    }

    @Override
    public Author findAuthorById(Long id) {
        return authorDAO.findAuthorById(id);
    }

    @Override
    public void addAuthor(Author author) {
        authorDAO.addAuthor(author);
    }

    @Override
    public void deleteAuthor(Author author) { authorDAO.deleteAuthor(author); }


}
