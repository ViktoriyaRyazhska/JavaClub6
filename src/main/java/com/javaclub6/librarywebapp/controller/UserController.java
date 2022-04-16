package com.javaclub6.librarywebapp.controller;

import com.javaclub6.librarywebapp.model.User;
import com.javaclub6.librarywebapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Locale;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String userForm(Locale locale, Model model) {
        model.addAttribute("users", userService.list());
        return "editUsers";
    }

    @ModelAttribute("user")
    public User formBackingObject() {
        return new User();
    }

    @PostMapping("/addUser")
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("users", userService.list());
            return "editUsers";
        }

        userService.save(user);
        return "redirect:/";
    }
}
