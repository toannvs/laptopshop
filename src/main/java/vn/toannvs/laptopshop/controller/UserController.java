package vn.toannvs.laptopshop.controller;

import org.springframework.web.bind.annotation.RestController;

import vn.toannvs.laptopshop.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/")
    public String getHomePage() {
        return "Hello, this is homepage";
    }
    @GetMapping("/user")
    public ModelAndView getUser() {
        return new ModelAndView("user");
    }
    
}
