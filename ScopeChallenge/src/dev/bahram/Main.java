package dev.bahram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer: ");
        X x = new X(scanner.nextInt());
        scanner.nextLine();
        x.x();
    }
}
