package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(100689));
    }

    public static int getLargestPrime(int number) {

        if (number <= 1) return -1;

        int maxFactorial = 0;
        int divisor = 2;
        while ( number != 0) {
            if (number % divisor == 0) {
                maxFactorial = number;
                number /= divisor;
                if (number == 1) {
                    break;
                }
            } else {
                divisor++;
            }
        }

        return maxFactorial;
    }
}
