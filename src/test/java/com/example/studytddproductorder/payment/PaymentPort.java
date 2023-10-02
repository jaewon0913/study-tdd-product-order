package com.example.studytddproductorder.payment;

import com.example.studytddproductorder.order.Order;

interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
