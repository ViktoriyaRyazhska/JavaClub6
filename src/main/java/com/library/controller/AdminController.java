package com.library.controller;

import com.library.model.Request;
import com.library.model.User;
import com.library.service.RequestService;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private RequestService requestService;

    @GetMapping
    public String index() {
        return "admin/index";
    }

//    @GetMapping("/users")
//    public String allUsers(Model model) {
//        model.addAttribute("users", userService.findAll());
//        return "admin/user_list";
//    }

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
}
