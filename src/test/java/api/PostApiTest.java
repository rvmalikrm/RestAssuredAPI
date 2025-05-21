package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.groovy.transform.SourceURIASTTransformation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PostApiTest {
    @Test
    public void createTokenTest(){
        // Base URI
        RestAssured.baseURI= "https://restful-booker.herokuapp.com";
        // Payload
        String payload= """
                {
                    "username" : "admin",
                    "password" : "password123"
                }
                """;
        // Send Post request
        Response response = RestAssured
                .given()
                    .contentType(ContentType.JSON)
                    .body(payload)
                .when()
                .log().all().post("/auth")
                .then().log().all().extract().response();
        // Print Response
        System.out.println("====================Here is the response of API======================");
        response.prettyPrint();
        // Validation
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
