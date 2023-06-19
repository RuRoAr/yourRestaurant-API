package com.myApp.yourRestaurantApi.controller;

import com.myApp.yourRestaurantApi.domain.Restaurant;
import com.myApp.yourRestaurantApi.domain.User;
import com.myApp.yourRestaurantApi.service.RestaurantService;
import com.myApp.yourRestaurantApi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestaurantController {
    private final Logger logger = LoggerFactory.getLogger(RestaurantController.class);


    @Autowired
    private RestaurantService restaurantService;

    // Lista todos los usuarios
    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {
        logger.info("Prepare a list for all restaurant");
        List<Restaurant> restaurants;

        logger.info("Find all restaurants");
        restaurants = restaurantService.findAllRestaurants();

        logger.info("End find all restaurants");
        return restaurants;

    }
}
