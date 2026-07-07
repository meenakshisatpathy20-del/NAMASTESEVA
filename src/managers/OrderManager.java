package managers;


import models.Order;
import enums.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {

    private static OrderManager instance;

    private List<Order> orders;

    private OrderManager() {
        orders = new ArrayList<>();
    }

    public static OrderManager getInstance() {

        if (instance == null) {
            instance = new OrderManager();
        }

        return instance;
    }

    public void addOrder(Order order) {

        orders.add(order);

        System.out.println(
                "Order Added Successfully: "
                        + order.getOrderId()
        );
    }

    public Order getOrderById(int orderId) {

        for (Order order : orders) {

            if (order.getOrderId() == orderId) {
                return order;
            }
        }

        return null;
    }

    public void updateOrderStatus(
            int orderId,
            OrderStatus newStatus) {

        Order order = getOrderById(orderId);

        if (order == null) {

            System.out.println(
                    "Order Not Found: " + orderId
            );

            return;
        }

        order.setStatus(newStatus);

        System.out.println(
                "Order "
                        + orderId
                        + " status updated to "
                        + newStatus
        );
    }

    public List<Order> getOrders() {
        return orders;
    }
}