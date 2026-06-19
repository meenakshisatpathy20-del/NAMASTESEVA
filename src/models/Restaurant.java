package models;

public class Restaurant {

    private int restaurantId;

    private String name;

    private String address;

    private Menu menu;

    public Restaurant(
            int restaurantId,
            String name,
            String address,
            Menu menu) {

        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.menu = menu;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Menu getMenu() {
        return menu;
    }
}