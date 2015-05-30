package com.mnknowledge.dp.behavioral.templatemethod.manual;

public abstract class HotBeverageRecipe {

    /**
     * Define our algorithm for hot beverage preparation recipe manual. <br>
     * Note: This is the template method in context of Template Method Design
     * Pattern.
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Note: this methods will be implemented in HotBeverageRecipe descendants.
     */
    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Note: this methods will be implemented in HotBeverageRecipe descendants.
     */
    abstract void addCondiments();
}
