package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("555-555-5555");

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        startPhone();
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printInstructions();
                    break;
                default:
                    break;
            }
        }
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }

    public static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To shutdown.");
        System.out.println("\t 1 - To print contacts.");
        System.out.println("\t 2 - To add an contact to the list.");
        System.out.println("\t 3 - To update a contact in the list.");
        System.out.println("\t 4 - To remove an contact from the list.");
        System.out.println("\t 5 - To query if an existing contact exists.");
        System.out.println("\t 6 - To print a list of available actions.");
    }

    private static void addContact() {
        System.out.print("Please enter the contact name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter the contact phone number: ");
        String number = scanner.nextLine();
        if (mobilePhone.addNewContact(Contact.createContact(name, number))) {
            System.out.println("New contact added, name: " + name + ", phone #: " + number);
        } else {
            System.out.println("Cannot add " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.print("Enter contact name to replace: ");
        String oldName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldName);

        if (oldContact == null) {
            System.out.println("Contact with name " + oldName + " was not found");
            return;
        }

        System.out.print("Please enter the new contact name: ");
        String newName = scanner.nextLine();
        System.out.print("Please enter the new contact phone number: ");
        String number = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, number);
        if (mobilePhone.updateContact(oldContact, newContact)) {
            System.out.println("Successfully updated contact");
        } else {
            System.out.println("Error updating contact");
        }
    }

    private static void removeContact() {
        System.out.print("Enter contact name to remove: ");
        String contactNameToRemove = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(contactNameToRemove);
        if (oldContact == null) {
            System.out.println("Contact with name " + contactNameToRemove + " was not found");
            return;
        }
        if (mobilePhone.removeContact(oldContact)) {
            System.out.println("Successfully deleted contact");
        } else {
            System.out.println("");
        }
    }

    private static void queryContact() {
        System.out.print("Contact to search for: ");
        String searchContact = scanner.nextLine();
        Contact contactRecord = mobilePhone.queryContact(searchContact);
        if(contactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + contactRecord.getName() + "\nPhone: " + contactRecord.getPhoneNumber());
    }

}
