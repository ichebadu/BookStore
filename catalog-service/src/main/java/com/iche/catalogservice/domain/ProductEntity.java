package com.iche.catalogservice.domain;


import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_generator")
    @SequenceGenerator(name = "product_id_generator", sequenceName = "product_id_seq")
    private Long id;

    @Column(nullable = false, unique = true)
    @NotEmpty(message = "Product code is required")
    private String code;

    @NotEmpty(message = "Product name is required")
    @Column(nullable = false)
    private String name;

    private String description;
    private String imageUrl;
    @NotNull(message = "Product price is required")
    @DecimalMin("0.1")
    @Column(nullable = false)
    private BigDecimal price;

    public ProductEntity(){
    }
    public ProductEntity(Long id, String code, String name, String description, String imageUrl, BigDecimal price) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.price = price;
    }
}
