package com.example.studytddproductorder.payment.adapter;

import com.example.studytddproductorder.payment.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

interface PaymentRepository extends JpaRepository<Payment, Long> {
}