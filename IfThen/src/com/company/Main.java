package com.company;

public class Main {

    public static void main(String[] args) {

        double dblVar1 = 20.00d;
        double dblVar2 = 80.00d;
        double valTotal = (dblVar1 + dblVar2) * 100.00d;
        double remainder = valTotal % 40.00d;
        boolean isNoRemainder = remainder == 0 ? true : false;
        System.out.println("valTotal: " + valTotal);
        System.out.println("remainder: " + remainder);
        System.out.println("isNoRemainder: " + isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
            System.out.println("-----*-*-*-----");
            System.out.println("-----*-*-*-----");
            System.out.println("-----*-*-*-----");

        boolean isAlien = false;

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore >= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 91;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        // Ternary Operator

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }
    }
}
