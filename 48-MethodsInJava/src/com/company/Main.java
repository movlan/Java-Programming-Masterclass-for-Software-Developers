package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isGameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(isGameOver, score, levelCompleted, bonus);
        System.out.println("Your finale score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(isGameOver, score, levelCompleted, bonus);
        System.out.println("Your finale score was " + highScore);

        int position = calculateHighScorePosition(1500);
        String name = "Mark";
        displayHighScorePosition(name, position);

        position = calculateHighScorePosition(900);
        name = "Steve";
        displayHighScorePosition(name, position);

        position = calculateHighScorePosition(400);
        name = "Bob";
        displayHighScorePosition(name, position);

        position = calculateHighScorePosition(50);
        name = "Rob";
        displayHighScorePosition(name, position);
    }

    public static int calculateScore(boolean isGameOver, int score, int levelCompleted, int bonus) {

        if (isGameOver) {
            int finaleScore = score + (levelCompleted * bonus);
            finaleScore += 2000;

            return finaleScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {

//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4; // assuming position 4 will be returned

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }

}
