package com.library.controller;

import com.library.model.Role;
import com.library.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.library.model.User;
import com.library.service.UserService;

import javax.validation.Valid;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping("/registration")
   public String register(){
        return "registration";
    }

    @PostMapping("/registration")
    public  String addUser(@ModelAttribute User user, @RequestParam String birth, Map<String, Object> model){
        User byEmail = userService.findByEmail(user.getEmail());
        if (byEmail != null){
            model.put("message", "You already have account");
            return "registration";
        }
        LocalDate dateOfBirth = LocalDate.parse(birth);
        user.setCreateTime(LocalDate.now());
        user.setDateOfBirth(dateOfBirth);
        user.setRole(roleService.findByTitle("User"));
        user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
        userService.save(user);
        return "redirect:/login";
    }

}
