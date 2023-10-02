package com.example.studytddproductorder.payment.application.port;

import com.example.studytddproductorder.order.domain.Order;
import com.example.studytddproductorder.payment.domain.Payment;

public interface PaymentPort {
    Order getOrder(Long orderId);

    void pay(int totalPrice, String cardNumber);

    void save(Payment payment);
}
