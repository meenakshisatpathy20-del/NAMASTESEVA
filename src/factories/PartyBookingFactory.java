package factories;

import models.*;

public class PartyBookingFactory {

    public PartyBooking createPartyBooking(
            int bookingId,
            User user,
            Restaurant restaurant,
            EventDetails eventDetails,
            CateringPackage cateringPackage,
            StaffService staffService,
            double advancePayment) {

        return new PartyBooking(
                bookingId,
                user,
                restaurant,
                eventDetails,
                cateringPackage,
                staffService,
                advancePayment
        );
    }
}