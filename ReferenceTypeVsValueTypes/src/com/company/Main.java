package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myInt = 10;
        int newInt = myInt;

        System.out.println("myInt = " + myInt);
        System.out.println("newInt = " + newInt);

        newInt ++;

        System.out.println("myInt = " + myInt);
        System.out.println("newInt = " + newInt);

        int[] myArr = new int[5];

        int[] anotherArr = myArr;

        System.out.println("myArr = " + Arrays.toString(myArr));
        System.out.println("anotherArr = " + Arrays.toString(anotherArr));

        anotherArr[0] = 10;
        System.out.println("myArr = " + Arrays.toString(myArr));
        System.out.println("anotherArr = " + Arrays.toString(anotherArr));
    }
}
