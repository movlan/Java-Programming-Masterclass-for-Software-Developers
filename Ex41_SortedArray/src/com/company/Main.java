package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers();

        printArray(myIntegers);
        printArray(sortIntegers(myIntegers));
    }

    public static int[] getIntegers(Integer number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        scanner.close();
        return values;
    }
    public static int[] getIntegers() {
        int[] values = new int[6];
        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        boolean swapped = true;

        while(swapped) {
            swapped = false;
            for (int i = 0; i < newArray.length - 1; i++) {
                if (newArray[i] < newArray[i + 1]) {
                    swapped = true;
                    int temp = newArray[i];
                    newArray[i] = newArray[i + 1];
                    newArray[i+1] = temp;
                }
            }
        }

        return newArray;
    }
}
