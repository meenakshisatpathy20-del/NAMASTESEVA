package models;

public class Coupon {

    private String couponCode;

    private double discountAmount;

    public Coupon(
            String couponCode,
            double discountAmount) {

        this.couponCode = couponCode;
        this.discountAmount = discountAmount;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }
}