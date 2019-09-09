package com.xavier.restaurantapi.service;

import com.xavier.restaurantapi.model.Restaurant;
import com.xavier.restaurantapi.repository.Restaurants;
import com.xavier.restaurantapi.service.exception.RestantExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {

    private Restaurants restaurants;

    public RestaurantService(@Autowired Restaurants restaurants) {
        this.restaurants = restaurants;
    }

    public Restaurant save(final Restaurant restaurant) {

        verifyIfRestaurantExists(restaurant);

        return this.restaurants.save(restaurant);
    }

    public List<Restaurant> findAll() {
        return restaurants.findAll();
    }

    private void verifyIfRestaurantExists(Restaurant restaurant) {
        Optional<Restaurant> foundRestaurant = restaurants.findByName(restaurant.getName());
        if (foundRestaurant.isPresent() && (restaurant.isNew() ||
                isUpdatingToAdifferentRestaurant(restaurant, foundRestaurant))) {
            throw new RestantExistsException();
        }
    }

    private boolean isUpdatingToAdifferentRestaurant(Restaurant restaurant, Optional<Restaurant> foundRestaurant) {
        return restaurant.isExists() && !restaurant.equals(foundRestaurant.get());
    }
}
