package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(findMin(readElements(readInteger())));
    }

    public static int readInteger() {
        int value;
        System.out.println("Enter integer value.\r");
        value = scanner.nextInt();
        return value;
    }

    public static int[] readElements(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        scanner.close();
        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
