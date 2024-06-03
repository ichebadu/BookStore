package com.iche.catalogservice.domain;

import java.util.List;

public record PagedResult<T>(
        List<T> data,
        long totalElement,
        long pageNumber,
        int totalPages,
        boolean isFirst,
        boolean isLast,
        boolean hasNext,
        boolean hasPrevious
) {
}
