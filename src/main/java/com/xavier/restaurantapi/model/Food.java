package com.xavier.restaurantapi.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "food")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "food_id")
    private Long foodId;

    private String name;

    private String description;

    private String imageUrl;

    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private FoodSize foodSize;

    private BigDecimal descount;

    @Column(name = "final_price")
    private BigDecimal finalPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private FoodCategory foodCategory;
}
