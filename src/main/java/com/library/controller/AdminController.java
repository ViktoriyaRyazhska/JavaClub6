package com.library.controller;

import com.library.model.Request;
import com.library.model.User;
import com.library.service.RequestService;
import com.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private RequestService requestService;

    @GetMapping
    public String index() {
        return "admin/index";
    }

    @GetMapping("/users")
    public String allUsers(Model model) {
        model.addAttribute("users", userService.findAll());
        return "admin/user_list";
    }

    @GetMapping("/users/details/{id}")
    public String getUserDetails(Model model, @PathVariable Long id) {
        User user = userService.findById(id);
        List<Request> requests = requestService.findByUserId(id);
        List<Request> hasRead = new ArrayList<>();
        List<Request> isReading = new ArrayList<>();
        for (Request request : requests) {
            if (request.getReturnDate() != null) {
                hasRead.add(request);
            } else {
                isReading.add(request);
            }
        }
        model.addAttribute("user", user);
        model.addAttribute("isReading", isReading);
        model.addAttribute("hasRead", hasRead);
        return "admin/user_details";
    }

    @RequestMapping("/users/statistics")
    public String getUsersStatistics(@RequestParam(required = false) String start, @RequestParam(required = false) String end, Model model) {
        LocalDate startDate;
        LocalDate endDate;
        if (start == null || end == null) {
            endDate = LocalDate.now();
            startDate = endDate.minusMonths(1);
        } else {
            startDate = LocalDate.parse(start);
            endDate = LocalDate.parse(end);
        }
        List<User> users = userService.findAll();
        Double sumAge = 0.0;
        Double sumTime = 0.0;
        for (User user : users) {
            Period age = Period.between(user.getDateOfBirth(), LocalDate.now());
            Period time = Period.between(user.getCreateTime(), LocalDate.now());
            sumAge += age.getYears();
            sumTime += time.getDays();
        }
        Double averageAge = sumAge / users.size();
        Double averageWorkingTime = sumTime / users.size();
        List<Request> requests = requestService.findByDateRange(startDate, endDate);
        model.addAttribute("averageAge", Math.round(averageAge * 100.0) / 100.0);
        model.addAttribute("averageWorkingTime", Math.round(averageWorkingTime * 100.0) / 100.0);
        model.addAttribute("requests", requests);
        return "admin/users_statistics";
    }
}
