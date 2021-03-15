package dev.bahram;

public class Main {

    public static void main(String[] args) {
//        SomeClass one = new SomeClass("One");
//        SomeClass two = new SomeClass("Two");
//        SomeClass three = new SomeClass("Three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
////        one.instanceNumber = 4;
//
//        int pw = 8431;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//
//        password.letMeIn(1);
//        password.letMeIn(617823672);
//        password.letMeIn(0);
//        password.letMeIn(-1);
//        password.letMeIn(8431);

        System.out.println("main method called");
        SIBTest test = new SIBTest();
        test.method();
        System.out.println("Owner is " + SIBTest.owner);
    }
}
