package dev.bahram;


public class StaticTest {
    private static int numInstances;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        this.numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}