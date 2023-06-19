package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.User;
import com.myApp.yourRestaurantApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebFilter;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> getUserByEmailAndPassword(String email, String password) {
       return  userRepository.getUserByEmailAndPassword(email,password);
    }
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public  List<String>checkUserEmail(String email){
        return userRepository.checkUserEmail(email);
    }

    @Override
    public List<String> checkUserPasswordByEmail(String email){
        return userRepository.checkUserPasswordByEmail(email);
    }

    @Override
    public  User getUserDetailsByEmail(String email){
        return userRepository.getUserDetailsByEmail(email);
    }





}
