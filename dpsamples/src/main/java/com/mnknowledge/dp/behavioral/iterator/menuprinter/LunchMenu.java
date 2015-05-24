package com.mnknowledge.dp.behavioral.iterator.menuprinter;

import java.util.Iterator;

public class LunchMenu implements Menu {
    static final int MAX_ITEMS = 7;
    int numberOfItems = 0;
    // keep menu items in array
    MenuItem[] menuItems;

    public LunchMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian salad", "(Fakin') Bacon with lettuce & tomato on whole wheat", false, 3.99);
        addItem("Lettuce salad", "Bacon with lettuce & tomato on whole wheat", false, 3.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 4.50);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 4.50);
        addItem("Sandwich", "Sandwich, with saurkraut, relish, onions, topped with cheese", false, 3.50);
        addItem("Steamed Veggies and Brown Rice", "A medly of steamed vegetables over brown rice", true, 4.99);
        addItem("Pasta of the day", "Spaghetti of the day with Marinara Sauce, and a slice of sourdough bread", true,
                4.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full!  Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return new LunchMenuIterator(menuItems);
    }

    // other menu methods here
}
