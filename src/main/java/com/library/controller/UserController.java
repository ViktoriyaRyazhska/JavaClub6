package com.library.controller;

import com.library.model.Book;
import com.library.model.Request;
import com.library.model.User;
import com.library.service.BookService;
import com.library.service.RequestService;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private BookService bookService;

    @Autowired
    private RequestService requestService;

    @Autowired
    private UserService userService;

    @GetMapping
    public String mainPage(Model model) {
        //get userName in the current session
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }

        User user = this.userService.findByEmail(username);
        List<Request> requests = requestService.findByUserId(user.getUserId());
        List<Request> hasRead = new ArrayList<>();
        List<Request> isReading = new ArrayList<>();
        for (Request request : requests) {
            if (request.getReturnDate() != null) {
                hasRead.add(request);
            } else {
                isReading.add(request);
            }
        }
        model.addAttribute("isReading", isReading);
        model.addAttribute("hasRead", hasRead);
        model.addAttribute("user", this.userService.findByEmail(username));
        return "user/user_main_page";
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
        return "user/book_list";
    }

    @GetMapping("/create_book_request")
    public String createRequest(Model model) {
        Request request = new Request();
        List<Book> allBooks = bookService.findAll();
        List<Book> availableBooks = new LinkedList<Book>();
        List<Request> requestList = requestService.findAll();
        // subtract amount of copies if book is not returned
        for (int i = 0; i < allBooks.size(); i++) {
            for (int j = 0; j < requestList.size(); j++) {
                if (requestList.get(j).getReturnDate() == null && requestList.get(j).getBook().getBookId() == allBooks.get(i).getBookId()) {
                    allBooks.get(i).setAmountOfCopies((allBooks.get(i).getAmountOfCopies()) - 1);
                }
            }
        }
        // adding available books to list
        for (int k = 0; k < allBooks.size(); k++) {
            if (allBooks.get(k).getAmountOfCopies() != 0) {
                availableBooks.add(allBooks.get(k));
            }
        }
        model.addAttribute("availableBooks", availableBooks);
        model.addAttribute("request", request);
        return "user/create_book_request";
    }

    @PostMapping("/createRequest")
    public String createRequest(@RequestParam String book) {
        //get userName in the current session
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        Request request = new Request();
        Book newBook = this.bookService.findBookById(Long.valueOf(book));
        request.setBook(newBook);
        request.setRequestDate(LocalDate.now());
        request.setUser(this.userService.findByEmail(username));
        requestService.createRequest(request);
        return "redirect:/user";
    }

    @GetMapping("return_book/{id}")
    public String deleteBook(@PathVariable Long id) {
        this.requestService.findById(id).setReturnDate(LocalDate.now());
        Request request = new Request();
        request = this.requestService.findById(id);
        request.setReturnDate(LocalDate.now());
        this.requestService.updateRequest(request);
        return "redirect:/user";
    }
}

