package com.mnknowledge.dp.behavioral.iterator.menuprinter;

public class MenuPrinterExample {
    public static void main(String args[]) {

        BreakFastMenu breakfastMenu = new BreakFastMenu();
        LunchMenu lunchMenu = new LunchMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();

        MenuPrinter printer = new MenuPrinter(breakfastMenu, lunchMenu, dinnerMenu);

        printer.printMenu();
        printer.printVegetarianMenu();
    }
}
