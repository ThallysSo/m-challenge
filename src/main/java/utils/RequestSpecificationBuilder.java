package utils;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.config.SSLConfig;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationBuilder {

    private RequestSpecificationBuilder() {
        throw new IllegalStateException("This class could not be instanced");
    }

    public static RequestSpecification build(String baseUri) {
        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder();
        requestSpecBuilder.setConfig(new RestAssuredConfig()
                .sslConfig(new SSLConfig().relaxedHTTPSValidation()));
        requestSpecBuilder.setRelaxedHTTPSValidation();
        requestSpecBuilder.setBaseUri(baseUri);
        requestSpecBuilder.setContentType(ContentType.JSON);
        return requestSpecBuilder.build();
    }
}