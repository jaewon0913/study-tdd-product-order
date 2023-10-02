package com.example.studytddproductorder.payment;

interface PaymentGateway {
    void execute(int totalPrice, String cardNumber);
}
