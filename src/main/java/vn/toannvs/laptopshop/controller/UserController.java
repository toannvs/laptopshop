package vn.toannvs.laptopshop.controller;

import org.springframework.web.bind.annotation.RestController;

import vn.toannvs.laptopshop.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    final private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/")
    public String getHomePage(@RequestParam String username) {
        return userService.getUser(username);
    }
    
}
