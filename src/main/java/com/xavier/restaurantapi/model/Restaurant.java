package com.xavier.restaurantapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "restaurant")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "restaurant_id")
    private Integer restauranteId;

    @NotBlank(message = "restaurant-1")
    private String name;

    @NotBlank(message = "restaurant-2")
    private String address;

    @NotBlank(message = "restaurant-3")
    private String phone;

    private Double latitude;

    private Double longetude;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "payment_url")
    private String paymentUrl;

    public Boolean isNew() {
        return this.restauranteId == null;
    }

    public  Boolean isExists() {
        return this.restauranteId != null;
    }
}
