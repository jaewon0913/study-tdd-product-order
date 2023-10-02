package com.example.studytddproductorder.product;

import com.example.studytddproductorder.product.application.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
public class ProductServiceTest_Section2 {

    @Autowired
    private ProductService productService;

    @Test
    void 상품조회() {
        //  상품등록
        productService.addProduct(ProductSteps.상품등록요청_생성());
        final long productId = 1L;

        //  상품 조회
        //final GetProductResponse response = productService.getProduct(productId);

        //  상품 응답 검증
        //assertThat(response).isNotNull();

    }

}
