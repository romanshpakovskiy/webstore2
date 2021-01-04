package by.it.romanshpakovskiy.webstore.controller;

import by.it.romanshpakovskiy.webstore.entities.User;
import by.it.romanshpakovskiy.webstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signIn")
    public String signIn(@RequestParam String email, @RequestParam String password, Model model) {
        User user = userService.signIn(email, password);
        model.addAttribute("user", user);
        return "mainPage";
    }
}
