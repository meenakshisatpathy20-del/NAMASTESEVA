package factories;

import models.Order;
import models.Restaurant;
import models.User;
import models.CartItem;

import java.util.List;

public abstract class OrderFactory {

    public abstract Order createOrder(
            int orderId,
            User user,
            Restaurant restaurant,
            List<CartItem> items);
}