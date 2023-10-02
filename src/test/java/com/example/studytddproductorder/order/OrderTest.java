package com.example.studytddproductorder.order;

import com.example.studytddproductorder.order.domain.Order;
import com.example.studytddproductorder.product.domain.DiscountPolicy;
import com.example.studytddproductorder.product.domain.Product;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class OrderTest {

    @Test
    void get_total_price() {
        final Order order = new Order(new Product("상품명", 2000, DiscountPolicy.FIX_1000_AMOUNT), 2);

        final int totalPrice = order.getTotalPrice();

        assertThat(totalPrice).isEqualTo(2000);
    }
}