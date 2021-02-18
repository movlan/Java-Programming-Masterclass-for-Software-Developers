package com.company;

public class Outlander extends Car {
    private int roadServiceMonth;

    public Outlander(boolean isManual, int roadServiceMonth) {
        super("Outlander", "4WD", 5, 5, 6, isManual);
        this.roadServiceMonth = roadServiceMonth;
    }
}
