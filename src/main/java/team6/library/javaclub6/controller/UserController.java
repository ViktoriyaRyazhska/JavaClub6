package team6.library.javaclub6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.service.BookService;
import team6.library.javaclub6.service.UserBookService;
import team6.library.javaclub6.service.UserService;
import java.security.Principal;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    BookService bookService;
    @Autowired
    UserBookService userBookService;
    @Autowired
    UserService userService;

    @GetMapping("")
    public String index(){
        return "user/index";
    }

    @GetMapping("/books")
    public ModelAndView bookList(Model model) {
        model.addAttribute("books", bookService.list());
        return new ModelAndView("user/books/list", "book", new Book());
    }
    @PostMapping("/rentBook")
    public String rent(@ModelAttribute("book")Book badBook, Principal principal) {
        User user = userService.findByEmail(principal.getName());
        Book book = bookService.findById(badBook.getId());
        userBookService.newRequest(book, user);
        return "redirect:/user/books";
    }
}
