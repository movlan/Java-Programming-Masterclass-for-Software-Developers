package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) return false;

        while (num1 > 0) {
            int digitNum1 = num1 % 10;

            int copyNum2 = num2;
            while (copyNum2 > 0) {
                int digitNum2 = copyNum2 % 10;
                System.out.println(digitNum1 + " " + digitNum2);

                if (digitNum1 == digitNum2) {
                    return true;
                }

                copyNum2 /= 10;
            }
            num1 /= 10;
        }
        return false;
    }
}
