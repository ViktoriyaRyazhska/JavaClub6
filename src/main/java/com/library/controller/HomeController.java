package com.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.annotation.WebServlet;

@Controller
public class HomeController {

    @GetMapping
    public String index() {
        return "index";
    }
}
