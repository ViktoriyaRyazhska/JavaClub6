package com.library.controller;

import com.library.model.Book;
import com.library.model.Request;
import com.library.service.BookService;
import com.library.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private BookService bookService;

    @Autowired
    private RequestService requestService;

    @GetMapping
    public String index(Model model) {
        model.addAttribute("books", bookService.popularBooks());
        return "index";
    }

    @GetMapping("/books")
    public String allBooks(Model model) {
        List<Book> books = bookService.findAll();
        List<Integer> availableCopies = new ArrayList<>();
        for (Book book : books) {
            availableCopies.add(book.getAmountOfCopies() - bookService.getNotReturned(book));
        }
        model.addAttribute("books", books);
        model.addAttribute("availableCopies", availableCopies);
        return "book_list";
    }

}
