package ua.javaclub14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ua.javaclub14.service.BookService;

import java.util.Locale;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;


    @GetMapping("/editBooks")
    public String bookForm(Locale locale, Model model) {
        model.addAttribute("books", bookService.list());
        return "editBooks";
    }
}
