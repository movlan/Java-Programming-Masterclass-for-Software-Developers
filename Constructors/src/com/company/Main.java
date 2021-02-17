package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount("12345", 123, "Bob White", "bob@mail.com", "302-722-2716");

        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
        bobsAccount.depositFunds(50.0);
        bobsAccount.withdrawFunds(100.0);
    }
}
