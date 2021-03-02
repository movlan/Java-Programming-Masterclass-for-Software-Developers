package com.company;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String name, double initialTransaction) {
        Customer newCustomer = new Customer(name, initialTransaction);
        Customer foundCustomer = findCustomer(name);
        if (foundCustomer == null) {
            this.customers.add(newCustomer);
            return true;
        } else {
            System.out.println("Customer with " + name + " already exists.\nCustomer was not added.");
            return false;
        }
    }

    public boolean addCustomerTransaction(String name, double transactionAmount) {
        Customer foundCustomer = findCustomer(name);
        if (foundCustomer != null) {
            foundCustomer.addTransaction(transactionAmount);
            return true;
        } else {
            System.out.println("Customer with " + name + " was not found.\nTransaction was not processed.");
            return false;
        }
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if(customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}
