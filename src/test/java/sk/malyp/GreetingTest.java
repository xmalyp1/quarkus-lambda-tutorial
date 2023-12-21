package sk.malyp;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

@QuarkusTest
public class GreetingTest {
    @Test
    public void testHello() {
      when().get("/hello").then()
                .contentType("text/plain")
                .body(equalTo("hello jaxrs"));
    }

}
