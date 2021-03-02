package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);

        printArray(myIntegers);

        System.out.println("Average of the numbers are: " + getAverage(myIntegers));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");

        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double) array.length;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }


//        int[] myIntArray = {1,2,3,4,5,6,7,8,9,10}; //new int[10];
//
////        myIntArray[0] = 50;
////        myIntArray[1] =328;
////        myIntArray[2] = 50;
//
//        for (int i = 0; i < myIntArray.length; i++) {
//            myIntArray[i] = (i + 1) * 10;
//        }
//
////        for (int i = 0; i < myIntArray.length; i++) {
////            System.out.println("Element " + i + ", value is " + myIntArray[i]);
////        }
//
//        printArray(myIntArray);
//        System.out.println(myIntArray);
//    }
//
}
