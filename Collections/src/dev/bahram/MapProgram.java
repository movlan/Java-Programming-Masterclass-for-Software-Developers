package dev.bahram;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();

        languages.put("Java", "A compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("AlGol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

//        System.out.println(languages.get("Java"));

        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "This course is about Java");
        }

//        System.out.println(languages.get("Java"));

        System.out.println("==========================================================================");

        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

        if (languages.remove("AlGol", "an algorithmic language")) {
            System.out.println("Algol was removed");
        } else {
            System.out.println("Algol was not removed, key-value pair not found");
        }

        System.out.println("==========================================================================");

        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

//        System.out.println(languages.remove("Lisp"));

        if (languages.replace("Lisp", "This will not work", "a functional programming language with imperative functions")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scalar", "will not be replaced sice it is not in the map"));


        System.out.println("==========================================================================");

        for (String key : languages.keySet()) {
            System.out.println(key + ": " + languages.get(key));
        }

    }
}
