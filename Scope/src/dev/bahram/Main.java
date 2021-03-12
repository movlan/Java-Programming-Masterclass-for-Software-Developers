package dev.bahram;

public class Main {

    public static void main(String[] args) {
        String var4 = "this is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner();

        System.out.println("scopeCheck var1 is " + scopeCheck.getVar1());
        System.out.println("var4 = " + var4);
        System.out.println("scopeCheck publicVar = " + scopeCheck.publicVar);

        System.out.println("*********************");
//        scopeCheck.timesTwo();
        System.out.println("*********************");
        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();

//        innerClass.timesTwo();
    }
}
