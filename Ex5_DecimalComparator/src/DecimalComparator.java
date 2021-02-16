public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); // --> true
        System.out.println(areEqualByThreeDecimalPlaces(3.112, 3.175)); // --> true
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        int intA = (int)(a * 1000);
        int intB = (int)(b * 1000);
        return intA == intB;
    }

}
