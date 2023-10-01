package com.example.studytddproductorder.order;

import com.example.studytddproductorder.product.Product;
import org.springframework.stereotype.Component;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(Order order);
}
