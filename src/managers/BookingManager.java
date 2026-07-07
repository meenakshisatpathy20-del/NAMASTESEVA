package managers;

import models.TableBooking;
import models.PartyBooking;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

    private static BookingManager instance;

    private List<TableBooking> tableBookings;
    private List<PartyBooking> partyBookings;

    private BookingManager() {
        tableBookings = new ArrayList<>();
        partyBookings = new ArrayList<>();
    }

    public static BookingManager getInstance() {

        if (instance == null) {
            instance = new BookingManager();
        }

        return instance;
    }

    public void addTableBooking(TableBooking tableBooking) {

        tableBookings.add(tableBooking);

        System.out.println(
                "Table Booking Added Successfully: "
                        + tableBooking.getBookingId()
        );
    }

    public void addPartyBooking(PartyBooking partyBooking) {

        partyBookings.add(partyBooking);

        System.out.println(
                "Party Booking Added Successfully: "
                        + partyBooking.getBookingId()
        );
    }

    public List<TableBooking> getTableBookings() {
        return tableBookings;
    }

    public List<PartyBooking> getPartyBookings() {
        return partyBookings;
    }
}