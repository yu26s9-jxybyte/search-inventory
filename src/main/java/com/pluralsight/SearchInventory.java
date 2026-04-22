package com.pluralsight;

import java.util.ArrayList;

public class SearchInventory {
    // my returns an inventory list
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();

        inventory.add(new Product(101, "Laptop", 899.99));
        inventory.add(new Product(102, "Wireless Mouse", 24.99));
        inventory.add(new Product(103, "Mechanical Keyboard", 79.99));
        inventory.add(new Product(104, "USB-C Charger", 19.99));
        inventory.add(new Product(105, "27-inch Monitor", 229.99));

        return inventory;
    }

    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        System.out.println("Store Inventory:");

        for (Product p : inventory) {
            System.out.printf("%d - %-20s $%.2f%n",
                    p.getId(),
                    p.getName(),
                    p.getPrice());
        }
    }
}

