package restAssuredclass5;

import static org.testng.Assert.assertEquals;

import org.jsoup.helper.HttpConnection.Response;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class RestAssuredExample {

    @Test
    public void positiveTestCase() {
        // Set base URI
        RestAssured.baseURI = "https://restcountries.com";

        // Send a GET request
        Response response = 
        		given().
        		when().
        		get("/v3.1/lang/spanish");

        // Assert HTTP status code
        assertEquals(response.getStatusCode(), 200, "Unexpected status code");

        // Add more assertions as needed for positive cases
    }

    @Test
    public void negativeTestCase() {
        // Set base URI
        RestAssured.baseURI = "https://api.example.com";

        // Send a GET request
        Response response = given()
                .when()
                .get("/nonexistentEndpoint");

        // Assert HTTP status code
        assertEquals(response.getStatusCode(), 404, "Unexpected status code");

        // Add more assertions as needed for negative cases
    }
}