package com.futuristic.dine.out.services.impl;

import com.futuristic.dine.out.model.Restaurant;
import com.futuristic.dine.out.repositories.RestaurantRepository;
import com.futuristic.dine.out.services.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * aditya created on 13/04/21
 */
@Slf4j
@Service
public class RestaurantServiceImpl implements RestaurantService {

    private RestaurantRepository repository;

    public RestaurantServiceImpl(RestaurantRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        log.debug("RestaurantServiceImpl --- getAllRestaurants --- started");
        List<Restaurant> restaurants = repository.findAll();
        log.debug("RestaurantServiceImpl --- getAllRestaurants --- ended");
        return restaurants;
    }
}
