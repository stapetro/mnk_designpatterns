package com.mnknowledge.dp.behavioral.iterator.menuprinter;

import java.util.Iterator;

public class MenuPrinter {
    Menu breakfastMenu;
    Menu lunchMenu;
    Menu dinnerMenu;

    public MenuPrinter(Menu breakfastMenu, Menu lunchMenu, Menu dinnerMenu) {
        this.breakfastMenu = breakfastMenu;
        this.lunchMenu = lunchMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> breakfastIterator = breakfastMenu.createIterator();
        Iterator<MenuItem> lunchIterator = lunchMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();

        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(breakfastIterator);
        System.out.println("\nLUNCH");
        printMenu(lunchIterator);
        System.out.println("\nDINNER");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.print(" -- " + menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        System.out.println("\nVEGETARIAN MENU\n---------------");
        printVegetarianMenu(breakfastMenu.createIterator());
        printVegetarianMenu(lunchMenu.createIterator());
        printVegetarianMenu(dinnerMenu.createIterator());
    }

    public boolean isItemVegetarian(String name) {
        Iterator<MenuItem> pancakeIterator = breakfastMenu.createIterator();
        if (isVegetarian(name, pancakeIterator)) {
            return true;
        }
        Iterator<MenuItem> dinerIterator = lunchMenu.createIterator();
        if (isVegetarian(name, dinerIterator)) {
            return true;
        }
        Iterator<MenuItem> cafeIterator = dinnerMenu.createIterator();
        if (isVegetarian(name, cafeIterator)) {
            return true;
        }
        return false;
    }

    private void printVegetarianMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.isVegetarian()) {
                System.out.print(" -- " + menuItem.getName() + ", ");
                System.out.println(menuItem.getPrice() + " -- ");
                System.out.println(menuItem.getDescription());
            }
        }
    }

    private boolean isVegetarian(String name, Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            if (menuItem.getName().equals(name)) {
                if (menuItem.isVegetarian()) {
                    return true;
                }
            }
        }
        return false;
    }
}
