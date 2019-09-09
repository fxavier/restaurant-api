package com.xavier.restaurantapi.repository;

import com.xavier.restaurantapi.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Restaurants extends JpaRepository<Restaurant, Integer> {

    Optional<Restaurant> findByName(String name);

}
