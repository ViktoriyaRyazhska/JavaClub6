package com.booklib.controller;

import java.util.Locale;

import com.booklib.entity.User;
import com.booklib.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String hello(Locale locale) {
        return "hello";
    }

    @GetMapping("/allUsers")
    public String users(Locale locale, Model model) {
        model.addAttribute("users", userService.list());
        return "allUsers";
    }

    @GetMapping("/editUsers")
    public String userForm(Locale locale, Model model) {
        // model.addAttribute("users", userService.list());
        return "editUsers";
    }

    @ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }

}