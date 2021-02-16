package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Enter number:" );
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int userNumber = scanner.nextInt();

                min = Math.min(min, userNumber);
                max = Math.max(max, userNumber);
                count++;

                if (count ==10) {
                    break;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }

            scanner.nextLine();
        }


        System.out.println("Min is: " + min);
        System.out.println("Max is: " + max);

        scanner.close();
    }
}
