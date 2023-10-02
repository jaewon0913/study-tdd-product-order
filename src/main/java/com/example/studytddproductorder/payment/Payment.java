package com.example.studytddproductorder.payment;

import com.example.studytddproductorder.order.Order;
import org.springframework.util.Assert;

final class Payment {
    private Long id;
    private final Order order;
    private final String cardNumber;


    Payment(Order order, String cardNumber) {
        Assert.notNull(order, "주문은는 필수입니다.");
        Assert.hasText(cardNumber, "카드 번호는 필수입니다.");
        this.order = order;
        this.cardNumber = cardNumber;
    }

    public void assigned(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public int getPrice() {
        return order.getTotalPrice();
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
