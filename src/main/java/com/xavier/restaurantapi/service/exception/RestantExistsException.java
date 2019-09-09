package com.xavier.restaurantapi.service.exception;

import org.springframework.http.HttpStatus;

public class RestantExistsException extends BusnessException {
    public RestantExistsException() {
        super("restaurant-4", HttpStatus.BAD_REQUEST);
    }
}
