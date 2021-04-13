package com.futuristic.dine.out.controllers;

import com.futuristic.dine.out.model.Restaurant;
import com.futuristic.dine.out.services.RestaurantService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * aditya created on 13/04/21
 */
@Slf4j
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private RestaurantService service;

    public RestaurantController(RestaurantService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Restaurant>> getAllRestaurant() {
        log.debug("RestaurantController --- getAllRestaurant --- start");
        List<Restaurant> allRestaurants = service.getAllRestaurants();
        log.debug("Restaurants size: " + allRestaurants.size());
        allRestaurants.forEach((restaurant) -> log.debug(restaurant.toString()));
        ResponseEntity<List<Restaurant>> responseEntity = new ResponseEntity<>(allRestaurants, HttpStatus.OK);
        log.debug("RestaurantController --- getAllRestaurant --- end");
        return responseEntity;
    }
}
