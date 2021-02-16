package com.company;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 1");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 2;

        switch (switchValue) {
            case 1:
                System.out.println("Switch value was 1");
                break;

            case 2:
                System.out.println("Switch value was 2");
                break;

            default:
                System.out.println("Switch value was not 1 or 2");
                break;
        }

        // Challenge

        char charValue = 'A';
        switch (charValue) {
            case 'A': case 'B': case 'C': case 'D':case 'E':
                System.out.println("Char '" + charValue + "' was found");
                break;

            default:
                System.out.println("A, B, C, D or E was not found");
                break;
        }
    }
}
