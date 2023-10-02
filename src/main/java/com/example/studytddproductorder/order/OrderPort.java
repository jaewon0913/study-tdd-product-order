package com.example.studytddproductorder.order;

import com.example.studytddproductorder.product.domain.Product;

interface OrderPort {
    Product getProductById(final Long productId);

    void save(Order order);
}
