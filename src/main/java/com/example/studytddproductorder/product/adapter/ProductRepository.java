package com.example.studytddproductorder.product.adapter;

import com.example.studytddproductorder.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
