package com.mnknowledge.dp.behavioral.iterator.menuprinter;

import java.util.ArrayList;
import java.util.Iterator;

public class BreakFastMenu implements Menu {
    // keep menu items in array list
    ArrayList<MenuItem> menuItems;

    public BreakFastMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("Pancakes with Strawberries", "Pancakes made with fresh strawberries, and strawberry syrup", true, 4.49);

        addItem("Pancakes with Blueberries", "Pancakes made with fresh blueberries, and blueberry syrup", true, 4.49);

        addItem("Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 3.99);

        addItem("Special Pancake Breakfast", "Pancakes with scrambled eggs, cheese and toast", true, 3.99);

        addItem("Waffles with berries", "Waffles, with your choice of blueberries or strawberries", true, 4.59);

        addItem("Brown Cookies", "Wheat brown cookies", true, 2.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    // may add other menu methods here
}
