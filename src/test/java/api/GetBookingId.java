package api;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
public class GetBookingId extends CreateBookingIDAPI {
    @Test(dependsOnMethods = "testCreateBookingID")
    public static void testgetBookingId(){
        RestAssured.baseURI= "https://restful-booker.herokuapp.com";
        Response response2= RestAssured
                .given()
                .when().log().all().get("/booking/"+bId)
                .then().log().all().extract().response();
        System.out.println("---------------------bid------------"+bId);
    }
}
