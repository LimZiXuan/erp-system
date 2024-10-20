package dev.erp_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dev.erp_system.model.User;
import dev.erp_system.service.UserService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/get")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    // @PostMapping("/create")
    // public User createUser(@RequestBody User user) {
    // user.setCreatedAt(LocalDateTime.now());
    // user.setUpdatedAt(LocalDateTime.now());
    // return userService.save(user);
    // }
}
