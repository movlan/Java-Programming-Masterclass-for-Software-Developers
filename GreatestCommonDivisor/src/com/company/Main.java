package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(25, 15)); // --> 5
    }

    public static int getGreatestCommonDivisor(int first, int second) {

        // return -1 if any if parameters are less than 10
        if (first < 10 || second < 10) return -1;

        // get smallest of two arguments
        int smallest = Math.min(first, second);

        // initialize gSD = 1;
        int gSD = 1;

        // loop from 2 to smallest
        for (int i = 2; i <= smallest; i++) {

            // check if first and second are both divisible by i w/o remainder
            if (first % i == 0 && second % i == 0) {

                // if so save number as gSD
                gSD = i;
            }
        }

        return gSD;
    }
}
