package com.library.controller;

import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("books", bookService.popularBooks());
        return "index";
    }

    @GetMapping("/books")
    public String allBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "book_list";
    }

}
