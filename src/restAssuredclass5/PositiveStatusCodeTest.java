package restAssuredclass5;



import org.openqa.selenium.remote.Response;

import io.restassured.RestAssured;

public
 
class PositiveStatusCodeTest {

    @org.testng.annotations.Test
    public void getProduct_returns200Ok() {
        Response response = RestAssured.get("https://example.com/products/1");
        response.then().statusCode(200);
    }
}