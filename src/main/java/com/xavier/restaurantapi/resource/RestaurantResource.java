package com.xavier.restaurantapi.resource;

import com.xavier.restaurantapi.model.Restaurant;
import com.xavier.restaurantapi.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/restaurants")
public class RestaurantResource {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    public List<Restaurant> findAll() {
        return restaurantService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurant create(@Valid @RequestBody Restaurant restaurant) {
        return restaurantService.save(restaurant);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @Valid @RequestBody Restaurant restaurant) {
        restaurant.setRestauranteId(id);
        restaurantService.save(restaurant);
    }
}
