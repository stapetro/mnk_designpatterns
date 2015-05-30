package com.mnknowledge.dp.behavioral.templatemethod.manual;

/**
 * Hot Beverage Recipe Manual Demo, demonstrating sample usage of Template
 * Method Pattern in Java.
 *
 * @author siiliev
 *
 */
public class HotBeverageManualDemo {
    public static void main(String[] args) {

        TeaRecipe tea = new TeaRecipe();
        CoffeeRecipe coffee = new CoffeeRecipe();

        System.out.println("\n----Making tea...");
        tea.prepareRecipe();

        System.out.println("\n----Making coffee...");
        coffee.prepareRecipe();
    }
}
