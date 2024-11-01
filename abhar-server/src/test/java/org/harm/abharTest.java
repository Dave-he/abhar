package org.harm;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class abharTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/abhar")
          .then()
             .statusCode(200)
             .body(is("Hello from Quarkus REST"));
    }

}