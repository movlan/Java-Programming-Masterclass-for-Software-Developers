package com.company;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateCluch(String inOrOut) {
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
}
