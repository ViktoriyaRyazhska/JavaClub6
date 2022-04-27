package com.library.controller;

import com.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public String mainPage(){
        return "user/user_main_page";
    }

    @GetMapping("/books")
    public String allBooks(Model model) {
        model.addAttribute("books", bookService.findAll());
        return "user/book_list";
    }
}
