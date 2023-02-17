package com.myApp.yourRestaurantApi.service;

import com.myApp.yourRestaurantApi.domain.Restaurant;
import com.myApp.yourRestaurantApi.domain.User;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> findAllRestaurants();
}
