package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateBookingTest_using_POJO {
    @Test
    public void createbookingusingPOJO(){
        RestAssured.baseURI= "https://restful-booker.herokuapp.com/";
        // Create BookingDates object
        BookingDates dates= new BookingDates();
        dates.setCheckIn("2025-05-01");
        dates.setCheckOut("2025-05-10");

        // Create Booking object
        Booking booking =new Booking();
        booking.setFirstName("Ravi");
        booking.setLastName("Malik");
        booking.setTotalPrice(123);
        booking.setDepositepaid(true);
        booking.setBookingdates(dates);
        booking.setAddtionalneeds("Lunch Done");

        // Send POST request
        Response response = given()
                .contentType(ContentType.JSON)
                .body(booking)
                .when()
                .log().all()
                .post("booking")
                .then().log().all()
                .statusCode(200)
                .extract().response();

        // Print response
        response.prettyPrint();


    }
}
