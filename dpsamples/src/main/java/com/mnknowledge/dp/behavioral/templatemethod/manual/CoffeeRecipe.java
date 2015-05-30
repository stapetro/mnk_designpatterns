package com.mnknowledge.dp.behavioral.templatemethod.manual;

public class CoffeeRecipe extends HotBeverageRecipe {

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
