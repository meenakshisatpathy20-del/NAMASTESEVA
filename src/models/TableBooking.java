package models;

import enums.BookingStatus;

public class TableBooking {

    private int bookingId;

    private User user;

    private Restaurant restaurant;

    private String bookingDate;

    private String bookingTime;

    private int guestCount;

    private double advancePayment;

    private BookingStatus status;

    public TableBooking(
            int bookingId,
            User user,
            Restaurant restaurant,
            String bookingDate,
            String bookingTime,
            int guestCount,
            double advancePayment) {

        this.bookingId = bookingId;
        this.user = user;
        this.restaurant = restaurant;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.guestCount = guestCount;
        this.advancePayment = advancePayment;

        this.status = BookingStatus.CREATED;
    }

    public int getBookingId() {
        return bookingId;
    }

    public User getUser() {
        return user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public int getGuestCount() {
        return guestCount;
    }

    public double getAdvancePayment() {
        return advancePayment;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(
            BookingStatus status) {

        this.status = status;
    }
}