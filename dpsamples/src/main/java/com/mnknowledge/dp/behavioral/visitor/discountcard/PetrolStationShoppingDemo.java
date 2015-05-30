package com.mnknowledge.dp.behavioral.visitor.discountcard;

import java.util.ArrayList;

/**
 * Sample Petrol Station Shopping Checkout Demo, demonstrating sample usage of
 * Visitor Pattern in Java.
 *
 * @author siiliev
 *
 */
public class PetrolStationShoppingDemo {

    // so far we do not need any real implementation for clients for our demo
    private static boolean clientHaveDiscountCard = true;

    public static void main(String[] args) {
        ArrayList<Object> items = new ArrayList<Object>();
        items.add(new Fuel("A95", 1.95, 50));
        items.add(new Oil("Motor Oil1", 10, 2));
        items.add(new Water("Bankia", 2, 1));

        // iterate through all items
        double totalAmount = 0;
        System.out.println(" Welcome to Petrol Station ");
        for (Object item : items) {
            Product fuel = (Product) item;
            totalAmount += fuel.getPrice();
            System.out.println(fuel.getName() + " x " + fuel.getCount() + ".........." + fuel.getPrice());
        }

        System.out.println(" ------------------ ");
        System.out.println("Total Amount: " + totalAmount);

        if (clientHaveDiscountCard) {
            // client have an discount card, so calculate it
            double calculateDiscount = calculateDiscount(items);
            System.out.println("Discount: " + calculateDiscount);
            System.out.println("Amount after discount: " + (totalAmount - calculateDiscount));
        }
    }

    public static double calculateDiscount(ArrayList<Object> items) {
        // create a our concrete visitor
        LoyalCardDiscountVisitor visitor = new LoyalCardDiscountVisitor();

        // visit all items
        for (Object item : items) {
            ((Visitable) item).accept(visitor);
        }

        double totalDiscount = visitor.getTotalDiscount();

        return totalDiscount;
    }
}
