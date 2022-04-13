package team6.library.javaclub6.controller;

import team6.library.javaclub6.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String userForm(Model model) {
        System.out.println("Book Controller");
        model.addAttribute("books", bookService.list());
        return "books/list";
    }
}
