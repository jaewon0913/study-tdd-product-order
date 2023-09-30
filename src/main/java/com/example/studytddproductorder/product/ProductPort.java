package com.example.studytddproductorder.product;

interface ProductPort {
    void save(final Product product);

    Product getProduct(long productId);
}
