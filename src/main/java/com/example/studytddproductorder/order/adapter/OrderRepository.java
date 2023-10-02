package com.example.studytddproductorder.order.adapter;

import com.example.studytddproductorder.order.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
