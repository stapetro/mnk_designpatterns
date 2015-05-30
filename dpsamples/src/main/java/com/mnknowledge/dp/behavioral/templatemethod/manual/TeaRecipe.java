package com.mnknowledge.dp.behavioral.templatemethod.manual;

public class TeaRecipe extends HotBeverageRecipe {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
