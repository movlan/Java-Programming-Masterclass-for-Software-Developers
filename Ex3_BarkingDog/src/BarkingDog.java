public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 1)); // --> ture
        System.out.println(shouldWakeUp (false, 2)); // --> false
        System.out.println(shouldWakeUp (true, 8)); // --> false
        System.out.println(shouldWakeUp (true, -1)); // --> false
    }

    public static boolean shouldWakeUp(boolean isDogBarking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if((hourOfDay < 8 || hourOfDay > 22) && isDogBarking) {
            return true;
        } else {
            return false;
        }
    }
}
