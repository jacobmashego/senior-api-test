import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class seniorApiTest {
        private final String baseURI = "http://jsonplaceholder.typicode.com";
        private final String endpoint = "/posts";

        @Test
        public void postResquestTest() {
            //initialize POST request data
            int postId = 1;
            String name = "Jacob";
            String email = "jacob.mashego.rsa@gmail.com";
            String body = java.time.LocalDate.now().toString();

            //Perform POST request
            RestAssured.given()
                    .baseUri(baseURI)
                    .header("Content-Type", "application/json")
                    .body("{ \"PostId\": " + postId + ", \"Name\": \"" + name + "\", \"Email\": \"" + email + "\", \"Body\": \"" + body + "\" }")
                    .when()
                    .post(endpoint)
                    .then()
                    .statusCode(201);
        }
}
