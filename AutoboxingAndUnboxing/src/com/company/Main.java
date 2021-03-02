package com.company;

import java.util.ArrayList;

class IntClass {
    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArr = new String[10];
	    int[] intArr = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();

        intArrayList.add(new IntClass(54));
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.21);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++) {
            integerArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + integerArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // Integer.valueOf(56);
        int myInt = myIntValue; // myIntValue.intValue();

        ArrayList<Double> myDoubleList = new ArrayList<Double>();

        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            myDoubleList.add(dbl);
        }

        for (int i = 0; i < myDoubleList.size(); i++) {
            double value = myDoubleList.get(i);
            System.out.println(i + " --> " + value);
        }

    }
}
