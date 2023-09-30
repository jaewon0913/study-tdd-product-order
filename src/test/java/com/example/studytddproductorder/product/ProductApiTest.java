package com.example.studytddproductorder.product;

import com.example.studytddproductorder.ApiTest;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ProductApiTest extends ApiTest {

    private final ProductSteps productSteps = new ProductSteps();

    @Test
    void 상품등록() {
        final var request = productSteps.상품등록요청_생성();

        // API 요청
        final var response = productSteps.상품등록요청(request);

        assertThat(response.statusCode()).isEqualTo(HttpStatus.CREATED.value());
    }

    private ExtractableResponse<Response> 상품등록요청(AddProductRequest request) {
        return productSteps.상품등록요청(request);
    }

    private AddProductRequest 상품등록요청_생셩() {

        return productSteps.상품등록요청_생성();
    }

}
