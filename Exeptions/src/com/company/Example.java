package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        float result = divide();
        System.out.println(result);
    }

    public static int divide() {
        int x, y;
        try {
            x = getInt();
            y = getInt();
        } catch (ArithmeticException e) {
            throw new ArithmeticException("No suitable input");
        }
        System.out.println("x is " + x + " and y is " + y);
        try {
            return x/y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("attempt divide by zero");
        }
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        while(true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                // go round again. Read past the end of line in the input
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 thorough 9");
            }
        }
    }
}
