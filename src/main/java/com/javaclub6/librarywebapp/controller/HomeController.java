package com.javaclub6.librarywebapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;

@Controller
public class HomeController
{
    @GetMapping("/home")
    public String homeInit(Locale locale, Model model) {
        return "home";
    }
}

