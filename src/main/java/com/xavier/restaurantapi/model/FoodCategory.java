package com.xavier.restaurantapi.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "food_category")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class FoodCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "category_id")
    private Long categoryId;

    private String name;

    private String imageUrl;
}
