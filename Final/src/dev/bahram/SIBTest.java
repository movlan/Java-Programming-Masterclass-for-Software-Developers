package dev.bahram;

public class SIBTest {
    public static final String owner;

    static {
        owner = "tim";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIBTest constructor is called");
    }

    static {
        System.out.println("2nd initialization block called");
    }

    public void method() {
        System.out.println("method() is called");
    }

}
