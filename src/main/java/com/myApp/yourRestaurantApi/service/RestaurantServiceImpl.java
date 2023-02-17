package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.Restaurant;
import com.myApp.yourRestaurantApi.domain.User;
import com.myApp.yourRestaurantApi.repository.RestaurantRepository;
import com.myApp.yourRestaurantApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Override
    public List<Restaurant> findAllRestaurants() {
        return restaurantRepository.findAll();
    }

}
