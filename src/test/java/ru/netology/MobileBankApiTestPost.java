package ru.netology;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


class MobileBankApiTestPost {
    @Test
    void shouldReturnDemoAccounts() {
        given()// Предусловия
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("привет")// отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()// Выполняемые действия
                .post("/post")
                .then()// Проверки
                .statusCode(205)
                .body("data", equalTo("привет"))
        ;
    }
}