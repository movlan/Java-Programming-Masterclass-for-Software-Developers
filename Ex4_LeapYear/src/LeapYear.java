public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); // --> false
        System.out.println(isLeapYear(1600)); // --> true
        System.out.println(isLeapYear(2017)); // --> false
        System.out.println(isLeapYear(2000)); // --> true
    }

    public static boolean isLeapYear(int year) {

        if(year < 1 || year > 9999) {
            return false;
        } else return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
