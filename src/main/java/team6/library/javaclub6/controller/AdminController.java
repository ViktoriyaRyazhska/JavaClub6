package team6.library.javaclub6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team6.library.javaclub6.model.AuthorBook;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.UserBook;
import team6.library.javaclub6.service.AuthorBookService;
import team6.library.javaclub6.service.AuthorService;
import team6.library.javaclub6.service.BookService;
import team6.library.javaclub6.service.UserBookService;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AuthorService authorService;
    @Autowired
    UserBookService userBookService;
    @Autowired
    BookService bookService;
    @Autowired
    AuthorBookService authorBookService;



    @GetMapping("")
    public String index(){
        return "admin/index";
    }

    @GetMapping("/userReadBooks")
    public String userReadBooks(Model model){
        model.addAttribute("userReadBook", userBookService.hasReadBookList());
        System.out.println("THIS IS OBJECT IN CONTROLLER" + userBookService.hasReadBookList());
        return "admin/userReadBooks";
    }

    @PostMapping("/registerBook")
    public String submit(@ModelAttribute("book") Book book, BindingResult result){
        AuthorBook authorBook = new AuthorBook();
        bookService.save(book);
        userBookService.newRequest(book, );
        return "admin/registerBook";
    }
}
