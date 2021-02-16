package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(1,10));
        System.out.println(1+3+5+7+9);
    }

    public static boolean isOdd(int number) {

        if (number <= 0) {
            return false;
        }

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {

        if (start > end || start < 0) {
            return -1;
        }

        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
