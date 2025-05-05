package org.howard.edu.lspfinal.question3;

/**
 * Demonstrates the reporting system
 */
public class Driver {
    public static void main(String[] args) {
        Report sales = new SalesReport();
        Report inventory = new InventoryReport();
        
        System.out.println("--- Generating Reports ---");
        sales.generate();
        System.out.println();
        inventory.generate();
    }
}
