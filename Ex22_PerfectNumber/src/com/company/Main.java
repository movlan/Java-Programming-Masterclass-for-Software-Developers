package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int sumOfDivisors = 0;

        for (int i = 1; i <= number/2; i++) {


            // check if number is divisible by i w/o remainder
            if (number % i == 0) {

                // if so add i to sumOfDivisors
                sumOfDivisors += i;
            }
        }
        // check if number is equal to sumOfDivisors
        return number == sumOfDivisors;
    }
}
