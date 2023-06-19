package com.myApp.yourRestaurantApi.controller;

import com.myApp.yourRestaurantApi.domain.User;
import com.myApp.yourRestaurantApi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/api/v1")
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
    public ResponseEntity<Object> loginUser(@RequestParam (value = "email", required = true) String email,
                                            @RequestParam (value = "password", required = true) String password)
    {
        List<User> users = userService.getUserByEmailAndPassword(email,password);
        if(users.isEmpty()){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);

        }
        else return ResponseEntity.ok(users) ;


    }
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
        logger.info("Register a new user", user);
        User newUser = userService.addUser(user);

        logger.info("End register a new user", user);
        return newUser;
    }

    private boolean respuestaDelServidorExitosa() {
        int codigoRespuesta = 200;

        return codigoRespuesta == 200;
    }
    }

    
}

