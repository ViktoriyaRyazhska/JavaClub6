package team6.library.javaclub6.controller;

import org.springframework.web.bind.annotation.*;
import team6.library.javaclub6.model.User;
import team6.library.javaclub6.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;

import javax.servlet.http.HttpServletRequest;
import java.sql.Date;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showForm() {
        return "register";
    }

    @PostMapping("/addUser")
    public String submit(HttpServletRequest request, BindingResult result) {
        User user = new User();
        if (result.hasErrors()) {
            return "error";
        }
        user.setName(request.getParameter("name"));
        user.setSurname(request.getParameter("surname"));
        user.setBirthDate(Date.valueOf(request.getParameter("birthDate")));
        user.setEmail(request.getParameter("email"));
        user.setRegistrationDate(new Date(System.currentTimeMillis()));
        user.setPassword(BCrypt.hashpw(request.getParameter("password"), BCrypt.gensalt(12)));
        userService.save(user);
        return "redirect:/login";
    }
}
