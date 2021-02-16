package com.company;

public class Main {

    public static void main(String[] args) {
        byte myNewByte = 100;
        short myNewShort = 30000;
        int myNewInt = 1_150;

        long myLongTotal = 50000 + 10 * (myNewByte + myNewShort + myNewInt);
        System.out.println(myLongTotal);
    }
}
