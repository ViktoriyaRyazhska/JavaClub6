package com.library.controller;

import com.library.model.Role;
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
import java.time.LocalDate;
import java.util.Map;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
   public String registaration(){
        return "registration";
    }

    @PostMapping("/registration")
    public  String addUser(User user, Map<String,Object> model){
        User byEmail = userService.findByEmail(user.getEmail());
        if(byEmail!=null){
            model.put("message","You already has account");
            return "registration";
        }
        user.setCreateTime(LocalDate.now());
//        user.setRole(new Role(1,"USER"));
        userService.save(user);
        return "redirect:/login";
    }

}
