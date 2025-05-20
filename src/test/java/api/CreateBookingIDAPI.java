package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateBookingIDAPI {
    @Test

    public void testCreateBookingID(){
        RestAssured.baseURI= "https://restful-booker.herokuapp.com";

        String payload= """
                {
                    "firstname" : "Pooja",
                    "lastname" : "Malik",
                    "totalprice" : 222,
                    "depositpaid" : true,
                    "bookingdates" : {
                        "checkin" : "2018-01-01",
                        "checkout" : "2019-01-01"
                    },
                    "additionalneeds" : "Breakfast"
                }""";
        Response response= RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .log().all().post("/booking");
        response.prettyPrint();
        Assert.assertEquals(response.getStatusCode(),200);

    }
}
