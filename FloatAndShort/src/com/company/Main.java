package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloat);
        System.out.println("Float maximum value = " + myMaxFloat);

        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDouble);
        System.out.println("Double maximum value = " + myMaxDouble);

        int myIntValue = 5 /2;
        float myFloatValue = 1f / 3f;
        double myDoubleValue = 1d / 3d;

        System.out.println("my int value = " + myIntValue);
        System.out.println("my float value = " + myFloatValue);
        System.out.println("my double value = " + myDoubleValue);
    }
}
