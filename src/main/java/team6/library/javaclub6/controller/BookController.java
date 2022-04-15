package team6.library.javaclub6.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import team6.library.javaclub6.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("")
    public String index(){
        return "books/index";
    }

    @GetMapping("/list")
    public String booksList(Model model) {
        model.addAttribute("books", bookService.list());
        return "books/list";
    }
}
