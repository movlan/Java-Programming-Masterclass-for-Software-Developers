package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDigitCount(10));
        System.out.println(getDigitCount(123));
        System.out.println(reverse(1212));
        System.out.println(reverse(-121));
        System.out.println(reverse(4321));
        numberToWords(123);
        numberToWords(1010);
    }

    public static int getDigitCount(int number) {

        // if number is negative return -1
        if (number < 0) return -1;

        if (number == 0) return 1;

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int reverse(int number) {

        // initialize a reverse variable
        int reverse = 0;
        // save original number to variable so we can compare later
        int originalNumber = number;

        // while loop to reverse number
        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return reverse;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }

        if (number == 0) {
            System.out.println("Zero");
        }

        String result = "";

        int reverse = reverse(number);

        while (number > 0) {
            String space = result.equals("") ? " " : "";

            String digitWord;

            switch (number % 10) {
                case 0:
                    digitWord = "Zero";
                    break;
                case 1:
                    digitWord = "One";
                    break;
                case 2:
                    digitWord = "Two";
                    break;
                case 3:
                    digitWord = "Three";
                    break;
                case 4:
                    digitWord = "Four";
                    break;
                case 5:
                    digitWord = "Five";
                    break;
                case 6:
                    digitWord = "Six";
                    break;
                case 7:
                    digitWord = "Seven";
                    break;
                case 8:
                    digitWord = "Eight";
                    break;
                case 9:
                    digitWord = "Nine";
                    break;
                default:
                    digitWord = "OTHER";
                    break;
            }


            result = digitWord + " " + result ;

            number /= 10;

        }
        System.out.println(result);
    }
}
