package team3.library.dao;

import team3.library.model.Author;

public interface AuthorDao {
    Author findByNameSurname(String name,  String surname);
    boolean finaByNameSurnameBool(String name, String surname);
    void saveAuthor(Author author);
}
