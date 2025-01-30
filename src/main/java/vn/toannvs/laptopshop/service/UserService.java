package vn.toannvs.laptopshop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUser(String username) {
        return "Hello " + username;
    }
}
