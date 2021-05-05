package com.company;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Locations locations = new Locations();

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        Location currentLocation = locations.getLocation(1);
        while (true) {
            System.out.println(currentLocation.getDescription());
            if (currentLocation.getLocationID() == 0) {
                break;
            }
            Map<String, Integer> exits = currentLocation.getExits();
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
                currentLocation = locations.getLocation(currentLocation.getExits().get(direction));
            } else {
                System.out.println("You cannot go in that direction");
            }
        }

        locations.close();
    }
}
