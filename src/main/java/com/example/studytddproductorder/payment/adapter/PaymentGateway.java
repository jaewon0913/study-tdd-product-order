package com.example.studytddproductorder.payment.adapter;

interface PaymentGateway {
    void execute(int totalPrice, String cardNumber);
}
