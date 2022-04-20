package com.booklib.controller;

import java.util.Locale;

import com.booklib.entity.Book;
import com.booklib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/allBooks")
    public String books(Locale locale, Model model) {
        model.addAttribute("books", bookService.list());
        return "allBooks";
    }
}