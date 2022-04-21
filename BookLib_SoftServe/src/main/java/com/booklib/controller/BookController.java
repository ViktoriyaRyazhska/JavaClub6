package com.booklib.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import com.booklib.entity.Author;
import com.booklib.entity.Book;
import com.booklib.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/allBooks")
    public String books(Locale locale, Model model) {
        model.addAttribute("books", bookService.list());
        return "allBooks";
    }

    @GetMapping("/allBooks/{title}")
    public String booksByTitle(@PathVariable("title") String title, Model model) {
        System.out.println(title);

        if (title.isEmpty()) {
            return "allBooks";
        } else {
            List<Book> bookList = bookService.findBookByTitle(title);
            model.addAttribute("books", bookList);
            return "allBooks";
        }

    }

}