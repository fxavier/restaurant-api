package com.xavier.restaurantapi.resource;

import com.xavier.restaurantapi.model.FoodSize;
import com.xavier.restaurantapi.service.FoodSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/sizes")
public class FoodSizeResource {

    @Autowired
    private FoodSizeService foodSizeService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FoodSize save(@Valid @RequestBody FoodSize foodSize) {

       return foodSizeService.save(foodSize);
    }
}
