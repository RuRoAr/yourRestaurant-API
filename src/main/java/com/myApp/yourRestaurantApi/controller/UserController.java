package com.myApp.yourRestaurantApi.controller;

import com.myApp.yourRestaurantApi.domain.User;
import com.myApp.yourRestaurantApi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    // Lista todos los usuarios
    @GetMapping("/users")
    public List<User> getUsers() {
        logger.info("Prepare a list for all users");
        List<User> users;

        logger.info("Find all users");
        users = userService.findAllUsers();

        logger.info("End find all users");
        return users;

    }
    @GetMapping("/login")
    public User loginUser(@RequestParam (value = "email", required = true) String email,
                          @RequestParam (value = "password", required = true) String password)
            {
        User user = userService.getUserByEmailAndPassword(email,password);
        return user;
    }

    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        logger.info("Register a new user", user);
        User newUser = userService.addUser(user);
        logger.info("End register a new user", user);
        return newUser;
    }

}
