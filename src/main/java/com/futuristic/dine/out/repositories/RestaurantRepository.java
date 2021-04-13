package com.futuristic.dine.out.repositories;

import com.futuristic.dine.out.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * aditya created on 13/04/21
 */
@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
}
