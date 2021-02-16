package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {

        System.out.println(getDurationString(61, 0));
        System.out.println(getDurationString(123456));
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        String formattedHour = hours < 10 ? "0" + hours : String.valueOf(hours);
        String formattedMinutes = remainingMinutes < 10 ? "0" + remainingMinutes : String.valueOf(remainingMinutes);
        String formattedSeconds = seconds < 10 ? "0" + seconds : String.valueOf(seconds);
        return formattedHour + "h " + formattedMinutes + "m " + formattedSeconds + "s";
    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
