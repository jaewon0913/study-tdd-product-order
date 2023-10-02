package com.example.studytddproductorder.order.application.port;

import com.example.studytddproductorder.order.domain.Order;
import com.example.studytddproductorder.product.domain.Product;

public interface OrderPort {
    Product getProductById(final Long productId);

    void save(Order order);
}
