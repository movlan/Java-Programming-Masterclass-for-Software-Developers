package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while (count <= 10) {

            System.out.println("Enter number #" + count + ":" );
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int userNumber = scanner.nextInt();

                sum += userNumber;
                count++;
            } else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine();
        }

        System.out.println("Sum of number you entered is " + sum);

        scanner.close();
    }

}
