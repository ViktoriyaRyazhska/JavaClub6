package team6.library.javaclub6.dao;

import team6.library.javaclub6.model.Author;

public interface AuthorDao {
    Author findByNameSurname(String name,  String surname);
}
