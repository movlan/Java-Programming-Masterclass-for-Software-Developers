package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int userNumber = scanner.nextInt();

                sum +=  userNumber;
                count++;

            } else {
                break;
            }

            scanner.nextLine();
        }

        long avg = Math.round((double) sum/count);
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
