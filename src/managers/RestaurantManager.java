package managers;

import models.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class RestaurantManager {

    private static RestaurantManager instance;

    private List<Restaurant> restaurants;

    private RestaurantManager() {
        restaurants = new ArrayList<>();
    }

    public static RestaurantManager getInstance() {

        if (instance == null) {
            instance = new RestaurantManager();
        }

        return instance;
    }

    public void addRestaurant(Restaurant restaurant) {

        restaurants.add(restaurant);

        System.out.println(
                "Restaurant Added Successfully: "
                        + restaurant.getName()
        );
    }

    public Restaurant getRestaurantById(int restaurantId) {

        for (Restaurant restaurant : restaurants) {

            if (restaurant.getRestaurantId() == restaurantId) {
                return restaurant;
            }
        }

        return null;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}