package com.booklib.controller;

import java.util.List;
import com.booklib.entity.Request;
import com.booklib.service.BookService;
import com.booklib.service.RequestService;
import com.booklib.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestController {
    @Autowired
    private RequestService requestService;

    @Autowired
    private BookService bookService;

    @Autowired
    private UserService userService;

    @GetMapping("/allRequests")
    public String requests(Model model) {
        model.addAttribute("requests", requestService.list());
        return "allRequests";

    }

    @GetMapping("/requests")
    public String requestsByUser(@RequestParam String id, Model model) {
        if (id.isEmpty()) {
            return "allRequests";
        } else {
            List<Request> requestList = requestService.listByUser(Long.parseLong(id));
            model.addAttribute("requests", requestList);
            return "allRequests";
        }

    }

    @GetMapping("/isReading")
    public String currentReaders(Model model) {
        model.addAttribute("requests", requestService.getCurrentReaders());
        return "allRequests";
    }

    // @PostMapping("/addRequest")
    // public String saveUser(@RequestParam String id, Model model) {
    // Request request = new Request();
    // Book book = bookService.findBookById(Long.parseLong(id));
    // request.setBook(book);
    // request.setFirst_day(new Date());

    // Calendar cal = Calendar.getInstance();
    // cal.setTime(request.getFirst_day());
    // cal.add(Calendar.DATE, 14);

    // request.setLast_day(cal.getTime());
    // request.setDate_return(null);

    // // Spring Security TODO:
    // // Authentication auth =
    // SecurityContextHolder.getContext().getAuthentication();
    // // String userEmail = auth.getName();
    // String userEmail = "email_3@mail.com";
    // User user = userService.findByEmail(userEmail);
    // request.setUser(user);

    // requestService.save(request);
    // return "redirect:/allRequests";
    // }

}
