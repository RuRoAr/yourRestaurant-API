package com.myApp.yourRestaurantApi.repository;

import com.myApp.yourRestaurantApi.domain.Restaurant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RestaurantRepository extends CrudRepository<Restaurant, Long> {

    List<Restaurant> findAll();



}
