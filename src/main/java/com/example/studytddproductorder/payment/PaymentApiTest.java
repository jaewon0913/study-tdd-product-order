package com.example.studytddproductorder.payment;

import com.example.studytddproductorder.ApiTest;
import com.example.studytddproductorder.order.OrderSteps;
import com.example.studytddproductorder.product.ProductSteps;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PaymentApiTest extends ApiTest {
    
     @Test
    void 상품주문() {
         ProductSteps.상품등록요청(ProductSteps.상품등록요청_생성());
         OrderSteps.상품주문요청(OrderSteps.상품주문요청_생성());

         final var request = PaymentSteps.주문결제요청_생성();

         final var response = PaymentSteps.주문결제요청(request);

         AssertionsForClassTypes.assertThat(response.statusCode()).isEqualTo(HttpStatus.OK.value());
     }
}
