package dev.bahram;

public class Main {

    public static void main(String[] args) {

        Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-100);
        timsAccount.calculateBalance();
        System.out.println("Balance on account " + timsAccount.getAccountName() + " is " + timsAccount.getBalance());
    }
}
