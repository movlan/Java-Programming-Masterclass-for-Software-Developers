package com.company;

class Car {
    private String name;
    private int wheels;
    private boolean engine;
    private int cylinders;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "Car ->  startEngine()";
    }

    public String accelerate() {
        return "Car ->  accelerate()";
    }

    public String brake() {
        return "Car ->  brake()";
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi ->  accelerate()";
    }

    @Override
    public String brake() {
        return "Mitsubishi ->  brake()";
    }
}

class Holden extends Car {
    public Holden(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Holden ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden ->  accelerate()";
    }

    @Override
    public String brake() {
        return "Holden ->  brake()";
    }
}

class Ford extends Car {
    public Ford(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Ford ->  startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford ->  accelerate()";
    }

    @Override
    public String brake() {
        return "Ford ->  brake()";
    }
}


public class Main {



    public static void main(String[] args) {

        Car car = new Car("Base Car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi("Outlander", 8);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford("Focus", 8);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Holden holden = new Holden("Commodore", 8);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }


}
