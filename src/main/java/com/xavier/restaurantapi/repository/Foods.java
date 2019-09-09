package com.xavier.restaurantapi.repository;

import com.xavier.restaurantapi.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Foods extends JpaRepository<Food, Long> {
}
