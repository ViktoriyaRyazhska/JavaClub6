package ua.javaclub14.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ua.javaclub14.service.AuthorService;

import java.util.Locale;

@Controller
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/editAuthors")
    public String authorForm(Locale locale, Model model) {
        model.addAttribute("authors", authorService.list());
        return "editAuthors";
    }

}
