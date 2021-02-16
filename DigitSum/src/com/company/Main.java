package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigit(9));
        System.out.println(sumDigit(11));
        System.out.println(sumDigit(125));
    }

    public static int sumDigit(int number) {

        int sum = 0;

        if (number < 10) {
            return -1;
        }

        while (number > 0) {

            sum += number % 10;

            number = number/10;

        }

        return sum;
    }
}
