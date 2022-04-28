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

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private BookService bookService;

    @Autowired
    private RequestService requestService;

    @GetMapping
    public String index(Model model) {
        //get userName in the current session
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        String username;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        model.addAttribute("user", this.userService.findByEmail(username));

        return "admin/index";

    }
    @GetMapping("/users")
    public String allUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "admin/user_list";
    }

    @GetMapping("/users/details/{id}")
    public String getUserDetails(Model model, @PathVariable Long id) {
        User user = userService.findById(id);
        List<Request> requests = requestService.findByUserId(id);
        List<Request> hasRead = new ArrayList<>();
        List<Request> isReading = new ArrayList<>();
        for (Request request : requests) {
            if (request.getReturnDate() != null) {
                hasRead.add(request);
            } else {
                isReading.add(request);
            }
        }
        model.addAttribute("user", user);
        model.addAttribute("isReading", isReading);
        model.addAttribute("hasRead", hasRead);
        return "admin/user_details";
    }



    @RequestMapping("/users/statistics")
    public String getUsersStatistics(@RequestParam(required = false) String start, @RequestParam(required = false) String end, Model model) {
        LocalDate startDate;
        LocalDate endDate;
        if (start == null || end == null) {
            endDate = LocalDate.now();
            startDate = endDate.minusMonths(1);
        } else {
            startDate = LocalDate.parse(start);
            endDate = LocalDate.parse(end);
        }
        List<User> users = userService.findAll();
        Double sumAge = 0.0;
        Double sumTime = 0.0;
        for (User user : users) {
            Period age = Period.between(user.getDateOfBirth(), LocalDate.now());
            Period time = Period.between(user.getCreateTime(), LocalDate.now());
            sumAge += age.getYears();
            sumTime += time.getDays();
        }
        Double averageAge = sumAge / users.size();
        Double averageWorkingTime = sumTime / users.size();
        List<Request> requests = requestService.findByDateRange(startDate, endDate);
        model.addAttribute("averageAge", Math.round(averageAge * 100.0) / 100.0);
        model.addAttribute("averageWorkingTime", Math.round(averageWorkingTime * 100.0) / 100.0);
        model.addAttribute("requests", requests);
        return "admin/users_statistics";
    }



    @GetMapping("/give_book")
    public String giveBook(Model model) {
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
        model.addAttribute("users", userService.findAll());
        return "admin/give_book";
    }


    @PostMapping("/giveBook")
    public String createRequest(@RequestParam String user, @RequestParam String book) {
        Request request = new Request();
        Book newBook = this.bookService.findBookById(Long.valueOf(book));
        request.setBook(newBook);
        request.setRequestDate(LocalDate.now());
        request.setUser(this.userService.findByEmail(user));
        requestService.createRequest(request);
        return "redirect:/admin";
    }
}
