package models;

import enums.EventType;

public class EventDetails {

    private EventType eventType;

    private String venue;

    private String eventDate;

    private int guestCount;

    public EventDetails(
            EventType eventType,
            String venue,
            String eventDate,
            int guestCount) {

        this.eventType = eventType;
        this.venue = venue;
        this.eventDate = eventDate;
        this.guestCount = guestCount;
    }

    public EventType getEventType() {
        return eventType;
    }

    public String getVenue() {
        return venue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public int getGuestCount() {
        return guestCount;
    }
}