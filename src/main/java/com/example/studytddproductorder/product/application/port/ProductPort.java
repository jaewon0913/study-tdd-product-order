package com.example.studytddproductorder.product.application.port;

import com.example.studytddproductorder.product.domain.Product;

interface ProductPort {
    void save(final Product product);

    Product getProduct(long productId);
}
