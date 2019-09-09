package com.xavier.restaurantapi.repository;

import com.xavier.restaurantapi.model.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategories extends JpaRepository<FoodCategory, Long> {
}
