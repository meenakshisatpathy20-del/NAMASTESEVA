package factories;

import models.CartItem;
import models.Order;
import models.Restaurant;
import models.User;

import java.util.List;

public class FoodOrderFactory
        extends OrderFactory {

    @Override
    public Order createOrder(
            int orderId,
            User user,
            Restaurant restaurant,
            List<CartItem> items) {

        return new Order(
                orderId,
                user,
                restaurant,
                items
        );
    }
}