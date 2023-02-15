package com.myApp.yourRestaurantApi.repository;

import com.myApp.yourRestaurantApi.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserRepository extends CrudRepository<User, Long> {

    List<User> findAll();
}