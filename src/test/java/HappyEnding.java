import client.ApiKey;
import groovy.util.logging.Slf4j;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

@Slf4j
public class HappyEnding {
    @Test(description = "Happy Ending")
    public void test_an_authorization() {
        ApiKey.getApiKey()
                .then()
                .statusCode(HttpStatus.SC_OK);
    }
}
