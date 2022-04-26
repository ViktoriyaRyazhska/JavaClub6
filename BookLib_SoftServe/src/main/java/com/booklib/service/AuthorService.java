package com.booklib.service;

import com.booklib.entity.Author;

public interface AuthorService {
    Author findAuthorBySurname(String name);

}
