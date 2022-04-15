package team6.library.javaclub6.controller;

import org.springframework.web.bind.annotation.*;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;
import java.sql.Date;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public ModelAndView showForm() {
        return new ModelAndView("register", "user", new User());
    }

    @PostMapping("/addUser")
    public String submit(@ModelAttribute("user")User user, BindingResult result, ModelMap map) {
        if (result.hasErrors()) {
            return "error";
        }
        user.setRegistrationDate(new Date(System.currentTimeMillis()));
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
        userService.save(user);
        return "redirect:/";
    }
}
