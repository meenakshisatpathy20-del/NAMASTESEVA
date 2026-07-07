package models;

import enums.BookingStatus;

public class PartyBooking {

    private int bookingId;
    private User user;
    private Restaurant restaurant;
    private EventDetails eventDetails;
    private CateringPackage cateringPackage;
    private StaffService staffService;
    private double advancePayment;
    private BookingStatus status;

    public PartyBooking(
            int bookingId,
            User user,
            Restaurant restaurant,
            EventDetails eventDetails,
            CateringPackage cateringPackage,
            StaffService staffService,
            double advancePayment) {

        this.bookingId = bookingId;
        this.user = user;
        this.restaurant = restaurant;
        this.eventDetails = eventDetails;
        this.cateringPackage = cateringPackage;
        this.staffService = staffService;
        this.advancePayment = advancePayment;

        // Every new party booking starts as PENDING
        this.status = BookingStatus.PENDING;
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

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public CateringPackage getCateringPackage() {
        return cateringPackage;
    }

    public StaffService getStaffService() {
        return staffService;
    }

    public double getAdvancePayment() {
        return advancePayment;
    }

    public void setAdvancePayment(double advancePayment) {
        this.advancePayment = advancePayment;
    }

    public BookingStatus getStatus() {
        return status;
    }

    public void setStatus(BookingStatus status) {
        this.status = status;
    }
}