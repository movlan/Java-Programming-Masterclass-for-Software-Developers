package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printFactors(6);
    }

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 1; i <= number; i++) {

            // check if number is divisible by i w/o remainder
            if (number % i == 0) {

                // if so print i
                System.out.println(i);
            }
        }
    }
}
