public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int yrs = (int)minutes / 525600;
        int remainingMinutes = (int) minutes % 525600;
        int days = remainingMinutes / 1440;
        System.out.println(minutes + " min = " + yrs + " y and " + days + " d");
    }
}
