package com.example.studytddproductorder.product;

import com.example.studytddproductorder.product.application.service.AddProductRequest;
import com.example.studytddproductorder.product.application.service.ProductService;
import com.example.studytddproductorder.product.domain.DiscountPolicy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTest_Section1 {

    @Autowired
    private ProductService productService;

    @Test
    void 상품등록() {
        final AddProductRequest request = 상품등록요청_생셩();

        productService.addProduct(request);
    }

    private AddProductRequest 상품등록요청_생셩() {
        final String name = "상품명";
        final int price = 1000;
        final DiscountPolicy discountPolicy = DiscountPolicy.NONE;

        return new AddProductRequest(name, price, discountPolicy);
    }

}
