package com.example.studytddproductorder.payment.application.port;

import com.example.studytddproductorder.order.Order;
import com.example.studytddproductorder.payment.domain.Payment;

public interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
