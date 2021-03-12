package dev.bahram.math;


import java.util.HashMap;

public class Series {
    static int nSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    static int factorial(int n) {
        if (n == 0) return 0;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

    static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long nMinus1 = 1;
        long nMinus2 = 0;
        long fib = 0;
        for (int i = 1; i < n; i++) {
            fib = nMinus2 + nMinus1;
            nMinus2 = nMinus1;
            nMinus1 = fib;
        }
        return fib;
    }
}
