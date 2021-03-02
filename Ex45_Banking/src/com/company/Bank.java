package com.company;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch == null) {
            branches.add(new Branch(branchName));
            return true;
        }

        System.out.println("Branch with name " + branchName + " already exists");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null) {
            boolean customerCreated = foundBranch.newCustomer(customerName, initialTransaction);
            if (customerCreated) {
//                System.out.println("Customer " + customerName + ", initial amount " + initialTransaction +
//                        " was created at branch " + branchName);
                return true;
            }
            return false;
        }
        System.out.println("Branch with name " + branchName + " was not found. Transaction cancelled!");
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null) {
            boolean transactionProcessed = foundBranch.addCustomerTransaction(customerName, transaction);
            if (transactionProcessed) {
//                System.out.println("Transaction posted for customer " + customerName + ", amount posted " + transaction +
//                        ", at branch " + branchName);
                return true;
            }
            return false;
        }
        System.out.println("Branch with name " + branchName + " was not found. Transaction cancelled!");
        return false;
    }

    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch foundBranch = findBranch(branchName);
        if (foundBranch != null) {
            System.out.println("Customer details for branch " + foundBranch.getName());
            for (int i = 0; i < foundBranch.getCustomers().size(); i++) {
                Customer customer = foundBranch.getCustomers().get(i);
                System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
                if (printTransactions) {
                    ArrayList<Double> transactions = customer.getTransactions();
                    System.out.println("Transactions");
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "]  Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if(branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }
}
