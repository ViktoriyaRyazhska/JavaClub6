package ua.javaclub14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import ua.javaclub14.service.AuthorService;
import ua.javaclub14.service.BookService;

import java.util.Locale;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private AuthorService authorService;


    @GetMapping("/editBooks")
    public String bookForm(Locale locale, Model model) {

        model.addAttribute("books", bookService.list());
        model.addAttribute("authors", authorService.list());
//        model.addAttribute( "books", bookService.findBookById(id));
//        model.addAttribute("authors", authorService.findAuthorById(id));

        return "editBooks";
    }
}
