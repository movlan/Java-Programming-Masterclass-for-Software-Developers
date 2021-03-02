package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

     public void addGroceryItem(String item) {
         groceryList.add(item);
     }
     public void printGroceryList() {
         System.out.println("You have " +groceryList.size() + " items in your grocery list");

         for (int i = 0; i < groceryList.size(); i++) {
             System.out.println((i + 1) + ". " + groceryList.get(i));
         }
     }

     public void modifyGroceryItem(String oldItem, String newItem) {
         int idx = findItem(oldItem);
         if (idx >= 0) {
             modifyGroceryItem(idx, newItem);
         }
     }

     private void modifyGroceryItem(int idx, String newItem) {
         groceryList.set(idx, newItem);

         System.out.println("Grocery item " + (idx + 1) + " has been modified.");
     }


     public void removeGroceryItem(String item) {
        int idx = findItem(item);
         if (idx >= 0) {
             removeGroceryItem(idx);
         }
     }

     private void removeGroceryItem(int idx) {
         groceryList.remove(idx);
     }

     private int findItem(String searchItem) {
         return  groceryList.indexOf(searchItem);
     }

     public boolean onFile(String searchItem) {
         int idx = findItem(searchItem);
         if (idx >= 0) {
             return true;
         }

         return false;
     }
}
