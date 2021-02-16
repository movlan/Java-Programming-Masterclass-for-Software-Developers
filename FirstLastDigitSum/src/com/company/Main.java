package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(-5));
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {

        // edge case
        // if number is negative return -1
        if (number < 0) {
            return -1;
        }

        // initialize sum with last digit
        // since it will always needs  last number
        int lastDigit = number % 10;

        int firstDigit = 0;

        while (number != 0) {

            // if number is less than 10 it in first digit
            // save it to firstDigit and break
            if (number < 10) {
                firstDigit = number;
            }

            // remove last digit
            number /= 10;
        }

        return firstDigit + lastDigit;
    }
}
