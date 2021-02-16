package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(21);
    }

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for(int i = 1; i <= number; i++) {
            for(int j = 1; j <= number; j++) {
                if (j == number) {
                    System.out.println("*");
                    continue;
                }
                if (i == j || j == 1 || i == 1 || i == number || i == (number - j + 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        }
    }
}
