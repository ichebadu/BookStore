package com.iche.catalogservice.domain;

import java.math.BigDecimal;

public record Product(
        String code,
        String name,
        String decription,
        String imageUrl,
        BigDecimal price) {
}
