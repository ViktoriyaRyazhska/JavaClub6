package com.library;

import com.library.model.Author;
import com.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditorSupport;

@Component
public class AuthorEditor extends PropertyEditorSupport {

    @Autowired
    private AuthorService authorService;

    @Override
    public void setAsText(String text) {
        Author author = this.authorService.findAuthorById(Long.valueOf(text));
        this.setValue(author);
    }
}
