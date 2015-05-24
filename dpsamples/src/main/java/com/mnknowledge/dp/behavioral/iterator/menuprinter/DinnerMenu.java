package com.mnknowledge.dp.behavioral.iterator.menuprinter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DinnerMenu implements Menu {
    // keep menu items in HashMap
    HashMap<String, MenuItem> menuItems = new HashMap<String, MenuItem>();

    public DinnerMenu() {
        addItem("Regular Burger", "Burger on a whole wheat bun, ham, lettuce, tomato, and fries", false, 3.99);
        addItem("Veggie Burger and Air Fries menu", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries",
                true, 4.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 4.69);
        addItem("Burrito", "A large burrito, with whole pinto beans, salsa, guacamole", true, 5.29);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    public Map<String, MenuItem> getItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
