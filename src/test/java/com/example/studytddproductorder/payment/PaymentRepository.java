package com.example.studytddproductorder.payment;

import java.util.HashMap;
import java.util.Map;

class PaymentRepository {

    private Map<Long, Payment> persistence = new HashMap<>();
    private Long sequence = 0L;

    public void save(final Payment payment) {

        payment.assigned(++sequence);

        persistence.put(payment.getId(), payment);
    }
}
