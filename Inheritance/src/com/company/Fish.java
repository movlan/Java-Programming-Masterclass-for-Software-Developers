package com.company;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {
        System.out.println("Fish.rest() called");
    }
    private void moveMussels() {
        System.out.println("Fish.moveMussels() called");
    }
    private void moveBackFin() {
        System.out.println("Fish.moveBackFin() called");
    }
    private void swim(int speed) {
        System.out.println("Fish.swim() called");
        moveMussels();
        moveBackFin();
        super.move(speed);
    }

    public int getGills() {
        return gills;
    }

    public int getEyes() {
        return eyes;
    }

    public int getFins() {
        return fins;
    }
}
