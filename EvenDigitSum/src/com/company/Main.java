package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static int getEvenDigitSum(int number) {

        // if number is negative return -1
        if (number < 0) return -1;

        // initialize sum value
        int sum = 0;

        while(number != 0) {
            int digit = number % 10;

            // if digit is even add it to sum
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }
}
