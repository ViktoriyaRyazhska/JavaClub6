package team6.library.javaclub6.service;

import team6.library.javaclub6.model.Author;

public interface AuthorService {
    Author findByNameSurname(String name, String surname);
}
