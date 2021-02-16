package com.company;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        for (int i = 1; i <= 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Found number divisible by both 3 and 5 it is: " + i);
                sum += i;
                count++;
            }

            if (count == 5) {
                break;
            }
        }

        System.out.println("\nSum after 5 numbers added together is: " + sum);;
    }
}
