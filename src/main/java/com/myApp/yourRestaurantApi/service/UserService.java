package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User deleteUser(long id);

    User addUser(User user);

    User modifyUser(User user, long id);

    User findUser(long id);
}
