package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("result = " + result);
        int previousResult = result;
        System.out.println("previousResult is " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("result - 1 = " + result);

        result = result * 10;
        System.out.println("result * 10 = " + result);

        result = result / 5;
        System.out.println("result / 5 = " + result);

        result = result % 3; // remainder of (4 % 3)
        System.out.println("result % 3 = " + result);

        result++;
        System.out.println("result++ = " + result);

        result--;
        System.out.println("result-- = " + result);

        result += 2;
        System.out.println("result += 2 is " + result);

        result *= 10;
        System.out.println("result *= 10 is " + result);

        result /= 3;
        System.out.println("result /= 3 is " + result);
    }
}
