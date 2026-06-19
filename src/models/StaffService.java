package models;

import enums.StaffType;

public class StaffService {

    private StaffType staffType;

    private int staffCount;

    private double costPerStaff;

    public StaffService(
            StaffType staffType,
            int staffCount,
            double costPerStaff) {

        this.staffType = staffType;
        this.staffCount = staffCount;
        this.costPerStaff = costPerStaff;
    }

    public StaffType getStaffType() {
        return staffType;
    }

    public int getStaffCount() {
        return staffCount;
    }

    public double getCostPerStaff() {
        return costPerStaff;
    }

    public double calculateTotalStaffCost() {

        return staffCount * costPerStaff;
    }
}