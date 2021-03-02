package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5};

        System.out.println(Arrays.toString(reverse(myArray)));
    }

    public static void reverse(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        System.out.println("Array = " + Arrays.toString(newArray));

        int i = 0;
        int j = array.length-1;

        while (i < j) {
            newArray[j] = array[i];
            newArray[i] = array[j];
            i++;
            j--;
        }
        System.out.println("Reversed array = " + Arrays.toString(newArray));
    }
}
