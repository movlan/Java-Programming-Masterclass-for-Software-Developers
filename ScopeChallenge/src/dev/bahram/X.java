package dev.bahram;

public class X {
    private int x;

    public X(int x) {
        this.x = x;
        System.out.println("X");
    }

    public void x() {
        for (int x = 1; x <= 12; x++) {
            System.out.println(x + " times " + this.x + " is " + x * this.x);
        }
    }
}
