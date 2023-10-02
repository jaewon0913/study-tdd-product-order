package com.example.studytddproductorder.payment;

import org.springframework.stereotype.Component;

@Component
public class ConsolePaymentGateway implements PaymentGateway {

    @Override
    public void execute(int totalPrice, String cardNumber) {
        System.out.println("상품 결제 완료");
    }
}
