package com.xavier.restaurantapi.service;

import com.xavier.restaurantapi.model.FoodSize;
import com.xavier.restaurantapi.repository.FoodSizes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodSizeService {

    private FoodSizes foodSizes;

    public FoodSizeService(@Autowired FoodSizes foodSizes) {
        this.foodSizes = foodSizes;
    }

    public FoodSize save(final FoodSize foodSize) {
        return this.foodSizes.save(foodSize);
    }
}
