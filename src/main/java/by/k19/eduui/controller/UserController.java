package by.k19.eduui.controller;

import by.k19.eduui.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private final UserService service;

    public UserController(UserService userService) {
        this.service = userService;
    }

    @GetMapping("/users")
    public ModelAndView getUsers() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("users", service.getUsers());
        return modelAndView;
    }
}
