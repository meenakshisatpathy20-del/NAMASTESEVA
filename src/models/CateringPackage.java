package models;

import enums.FoodPreference;

public class CateringPackage {

    private int packageId;

    private String packageName;

    private FoodPreference foodPreference;

    private boolean buffetIncluded;

    private double pricePerPerson;

    public CateringPackage(
            int packageId,
            String packageName,
            FoodPreference foodPreference,
            boolean buffetIncluded,
            double pricePerPerson) {

        this.packageId = packageId;
        this.packageName = packageName;
        this.foodPreference = foodPreference;
        this.buffetIncluded = buffetIncluded;
        this.pricePerPerson = pricePerPerson;
    }

    public int getPackageId() {
        return packageId;
    }

    public String getPackageName() {
        return packageName;
    }

    public FoodPreference getFoodPreference() {
        return foodPreference;
    }

    public boolean isBuffetIncluded() {
        return buffetIncluded;
    }

    public double getPricePerPerson() {
        return pricePerPerson;
    }
}