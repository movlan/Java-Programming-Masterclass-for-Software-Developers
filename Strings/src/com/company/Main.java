package com.company;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int - most common
        // long
        // float
        // double - most common
        // char
        // boolean - most common

        String  myString = "This is a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2021";
        System.out.println("myString is equal to " + myString);

        String numberString = "230.55";
        numberString = numberString + "49.95";
        System.out.println("is equal to " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("lastString is equal to " + lastString);
    }
}

