package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();


    User getUserByEmailAndPassword(String email, String password);

    User addUser(User user);
}
