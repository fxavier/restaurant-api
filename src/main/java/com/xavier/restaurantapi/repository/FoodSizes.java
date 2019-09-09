package com.xavier.restaurantapi.repository;

import com.xavier.restaurantapi.model.FoodSize;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodSizes extends JpaRepository<FoodSize, Integer> {
}
