package models;

import java.util.List;
import enums.OrderStatus;

public class Order {

    private int orderId;

    private User user;

    private Restaurant restaurant;

    private List<CartItem> items;

    private Coupon coupon;

    private DeliveryPartner deliveryPartner;

    private double totalAmount;

    // Current stage of the food order
    private OrderStatus status;

    public Order(
            int orderId,
            User user,
            Restaurant restaurant,
            List<CartItem> items) {

        this.orderId = orderId;
        this.user = user;
        this.restaurant = restaurant;
        this.items = items;

        // Every newly created order starts as PLACED
        this.status = OrderStatus.PLACED;
    }

    public int getOrderId() {
        return orderId;
    }

    public User getUser() {
        return user;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public Coupon getCoupon() {
        return coupon;
    }

    public void setCoupon(Coupon coupon) {
        this.coupon = coupon;
    }

    public DeliveryPartner getDeliveryPartner() {
        return deliveryPartner;
    }

    public void assignDeliveryPartner(
            DeliveryPartner deliveryPartner) {

        this.deliveryPartner = deliveryPartner;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}