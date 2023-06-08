package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();


    User getUserByEmailAndPassword(String email, String password);

    User addUser(User user);

    List<String> checkUserPasswordByEmail(String email);
    List<String>checkUserEmail(String email);
    User getUserDetailsByEmail(String email);
}
