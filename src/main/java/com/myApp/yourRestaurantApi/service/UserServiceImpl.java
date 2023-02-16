package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.User;
import com.myApp.yourRestaurantApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }



}
