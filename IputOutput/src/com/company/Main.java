package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<>();
        int loc = 1;
        while (true) {
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0) {
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit: exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String input = scanner.nextLine().toUpperCase();
            String direction = null;
            if (input.length() > 1) {
                String[] splitInput = input.split(" ");
                if (splitInput.length > 1) {
                    for (String word: splitInput) {
                        if (word.equals("NORTH") || word.equals("EAST") || word.equals("SOUTH") || word.equals("WEST") || word.equals("QUIT")) {
                            direction = String.valueOf(word.charAt(0));
                            break;
                        }
                    }
                } else {
                    direction = String.valueOf(splitInput[0].charAt(0));
                }
            } else {
                direction = input;
            }

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }

            if (!locations.containsKey(loc)) {
                System.out.println("You cannot to in that direction");
            }
        }
    }
}
