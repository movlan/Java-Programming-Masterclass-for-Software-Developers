package com.company;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        System.out.println("Empty constructor called");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 100.0, customerName, email, phoneNumber);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("The $" + depositAmount + " was added to account " + this.accountNumber + ". New balance is $" + this.balance + ".");
    }

    public void withdrawFunds(double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Insufficient funds. Withdraw is not permitted");
        } else {
            this.balance -= withdrawAmount;
            System.out.println("The $" + withdrawAmount + " was withdrawn from account " + this.accountNumber + ". New balance is $" + this.balance + ".");
        }
    }
}
