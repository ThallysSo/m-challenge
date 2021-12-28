package specification;

import io.restassured.specification.RequestSpecification;
import utils.RequestSpecificationBuilder;
import utils.URLReader;

public class ApiKeySpecification {

    private ApiKeySpecification() {
        throw new IllegalStateException("This class could not be instanced");
    }

    public static RequestSpecification getSpecification() {
        return RequestSpecificationBuilder
                .build(URLReader.getUrl("api-key"));
    }
}
