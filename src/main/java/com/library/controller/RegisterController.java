package com.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.library.model.User;
import com.library.service.UserService;

import java.sql.Date;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public ModelAndView showForm() {
        return new ModelAndView("registration", "user", new User());
    }


}
