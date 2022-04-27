package team6.library.javaclub6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import team6.library.javaclub6.model.Book;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.model.UserBook;
import team6.library.javaclub6.service.BookService;
import team6.library.javaclub6.service.RequestStatusService;
import team6.library.javaclub6.service.UserBookService;
import team6.library.javaclub6.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.sql.Date;
import java.util.*;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    BookService bookService;
    @Autowired
    UserBookService userBookService;
    @Autowired
    UserService userService;
    @Autowired
    RequestStatusService requestStatusService;

    @GetMapping("")
    public String index(Model model, Principal principal){
        User user = userService.findByEmail(principal.getName());
        Date currentDate = new Date(System.currentTimeMillis());
        model.addAttribute("nameAndSurname", user.getName() + " " + user.getSurname());
        model.addAttribute("userbooks", userService.getUserBooks(user));
        model.addAttribute("popularList", bookService.popularList(currentDate.getYear(), currentDate.getMonth()));
        return "user/index";
    }

    @GetMapping("/requests")
    public String requestList(Model model, Principal principal){
        User user = userService.findByEmail(principal.getName());
        model.addAttribute("userbooks", userService.getRequestList(user));
        return "user/requestlist";
    }

    @GetMapping("/books")
    public ModelAndView bookList(Model model) {
        model.addAttribute("books", bookService.list());
        return new ModelAndView("user/books/list", "book", new Book());
    }

    @GetMapping("/userbookslist")
    public String userBooksList(Model model, Principal principal){
        User user = userService.findByEmail(principal.getName());
        model.addAttribute("nameAndSurname", user.getName() + " " + user.getSurname());
        model.addAttribute("userbooks", userService.getUserBooks(user));
        return "user/userbookslist";
    }

    @GetMapping("/profile")
    public String profile(Model model, Principal principal){
        User user = userService.findByEmail(principal.getName());
        model.addAttribute("currentUser", user);
        return "/user/profile";
    }

    @GetMapping("/changeprofile")
    public ModelAndView changeProfile(){
        return new ModelAndView("/user/changeprofile", "user", new User());
    }

    @GetMapping("/history")
    public String history(Model model, Principal principal){
        User user = userService.findByEmail(principal.getName());
        model.addAttribute("userbooks", userService.getHistory(user));
        return "/user/history";
    }

    @PostMapping("change")
    public String change(HttpServletRequest request, Principal principal){
        User user = userService.findByEmail(principal.getName());
        if (!request.getParameter("name").equals("")){
            user.setName(request.getParameter("name"));
        }
        if (!request.getParameter("surname").equals("")){
            user.setSurname(request.getParameter("surname"));
        }
        if (!request.getParameter("password").equals("")){
            user.setPassword(BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt(12)));
        }
        if (!request.getParameter("birthDate").equals("")){
            user.setBirthDate(Date.valueOf(request.getParameter("birthDate")));
        }
        userService.update(user);
        return "redirect:/user/profile";
    }

    @PostMapping("/rentBook")
    public String rent(@ModelAttribute("book")Book badBook, Principal principal) {
        User user = userService.findByEmail(principal.getName());
        Book book = bookService.findById(badBook.getId());
        userBookService.newRequest(book, user);
        return "redirect:/user/books";
    }

    @PostMapping("/returnBook")
    public String returnBook(HttpServletRequest request) {
        UserBook userBook = new UserBook();
        userBook.setFkUser(userService.findById(Integer.parseInt(request.getParameter("userId"))));
        userBook.setFkBook(bookService.findById(Integer.parseInt(request.getParameter("bookId"))));
        userBook.setFkStatus(requestStatusService.findById(1));
        userBook.setShouldReturnDate(Date.valueOf(request.getParameter("shouldReturnDate")));
        userBook.setRentDate(Date.valueOf(request.getParameter("rentDate")));
        //System.out.println(userBook);
        userBookService.returnBook(userBook);
        return "redirect:/user/userbookslist";
    }
}
