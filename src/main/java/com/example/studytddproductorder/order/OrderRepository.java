package com.example.studytddproductorder.order;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
class OrderRepository {
    private Map<Long, Order> persistence = new HashMap<>();
    private Long sequence = 0L;

    public void save(final Order order) {
        order.assigned(++sequence);
        persistence.put(order.getId(), order);
    }
}