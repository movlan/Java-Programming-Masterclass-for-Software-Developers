package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(02,3,7));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) return false;

        while ((bigCount + smallCount) > 0 && goal > 0) {
            if (bigCount > 0) {
                if (goal >= 5) {
                    goal -= 5;
                }
                bigCount--;
                if ( goal == 0 ) {
                    return true;
                }
            }

            if ( (bigCount == 0 || goal < 5 ) && smallCount > 0 ) {
                goal--;
                smallCount--;
            }
        }
        return goal == 0;
    }


}
