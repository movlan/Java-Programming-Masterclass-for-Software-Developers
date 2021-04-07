package dev.bahram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i <= 20; i++) {
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("There are " + squares.size() + " squares");
        System.out.println("There are " + cubes.size() + " cubes");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);

        System.out.println("There are " + union.size() + " union");

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);

        System.out.println("There are " + intersection.size() + " intersection");

        for (int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of fox";
        String[] arrWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.remove(divine);
        printSet(diff1);

        System.out.println("divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff1.remove(nature);
        printSet(diff2);

        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);

        System.out.println(nature.containsAll(divine));
        System.out.println(nature.containsAll(intersectionTest));
    }

    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
