package org.howard.edu.lspfinal.question1;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private final Map<String, Double> items = new HashMap<>();
    private double discount = 0;

    public void addItem(String name, double price) {
        if (price <= 0) throw new IllegalArgumentException("Price must be positive");
        items.put(name, price);
    }

    public void applyDiscount(String code) {
        if ("SAVE10".equals(code)) discount = 10;
        else throw new IllegalArgumentException("Invalid discount code");
    }

    public double getTotal() {
        double subtotal = items.values().stream().reduce(0.0, Double::sum);
        return subtotal * (1 - discount/100);
    }

    public int getItemCount() {
        return items.size();
    }
}