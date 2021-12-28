package client;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import specification.ApiKeySpecification;
import utils.HealthChecker;

public class ApiKey {

    public ApiKey() {
        HealthChecker.check(ApiKeySpecification.getSpecification());
    }

    public static Response getApiKey() {
        return RestAssured.given()
                .auth().preemptive().basic("egg", "f00BarbAz!")
                .spec(ApiKeySpecification.getSpecification())
                .post("/token");
    }
}

