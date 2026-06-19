package models;

public class DeliveryPartner {

    private int partnerId;

    private String name;

    private String phoneNumber;

    private boolean available;

    public DeliveryPartner(
            int partnerId,
            String name,
            String phoneNumber) {

        this.partnerId = partnerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.available = true;
    }

    public int getPartnerId() {
        return partnerId;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(
            boolean available) {

        this.available = available;
    }
}
