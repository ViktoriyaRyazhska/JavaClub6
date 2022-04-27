package com.booklib.controller;

import java.util.Locale;

import com.booklib.entity.Roles;
import com.booklib.entity.User;
import com.booklib.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
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

    @GetMapping("/addUser")
    public String addUser(Locale locale, Model model) {
        model.addAttribute("users", userService.list());
        return "addUser";
    }

    @PostMapping("/addUser")
    public String userForm(@ModelAttribute("user") @Valid User user,
            BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "addUser";
        }
        // Roles role = userService.findRole(2L);
        // user.setRoles(role);
        userService.save(user);
        return "redirect:/addUser";
    }

    @ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }

}