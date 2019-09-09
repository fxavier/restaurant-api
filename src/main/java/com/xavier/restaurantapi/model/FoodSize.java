package com.xavier.restaurantapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "food_size")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FoodSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "size_id")
    private Integer sizeId;

    @NotBlank(message = "Size-1")
    private String description;
}
