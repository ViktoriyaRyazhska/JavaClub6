package team6.library.javaclub6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import team6.library.javaclub6.service.EmailService;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    EmailService emailService;

    @GetMapping("")
    public String index(){
        return "login";
    }
}
