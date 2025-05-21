package api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Booking {
    @JsonProperty("firstname")
    private String firstName;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("totalprice")
    private int totalPrice;
    @JsonProperty("depositpaid")
    private boolean depositepaid;
    @JsonProperty("bookingdates")
    private BookingDates bookingdates;
    @JsonProperty("additionalneeds")
    private String addtionalneeds;
    // Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositepaid() {
        return depositepaid;
    }

    public void setDepositepaid(boolean depositepaid) {
        this.depositepaid = depositepaid;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    public String getAddtionalneeds() {
        return addtionalneeds;
    }

    public void setAddtionalneeds(String addtionalneeds) {
        this.addtionalneeds = addtionalneeds;
    }
}
