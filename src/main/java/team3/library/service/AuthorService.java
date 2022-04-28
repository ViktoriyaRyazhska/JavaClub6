package team3.library.service;

import team3.library.model.Author;

public interface AuthorService {
    Author findByNameSurname(String name, String surname);
    boolean finaByNameSurnameBool(String name, String surname);
    void saveAuthor(Author author);
}
