package com.mnknowledge.dp.behavioral.memento.coffee;

import com.mnknowledge.dp.behavioral.memento.coffee.CoffeeMachine.CoffeeOptionsMemento;

public class CoffeeMachineCaretaker {

    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        machine.longCoffee().withMilk().withSugar();
        System.out.println(machine);
        CoffeeOptionsMemento optionsMemento = machine.saveOptions();
        System.out.println("\nSave them and clear selection!");
        machine.clearCoffePreferences();
        System.out.println(machine);
        System.out.println("\nSelect short coffee but do not save it.");
        machine.shortCoffee();
        System.out.println(machine);
        System.out.println("\nRestore saved options.");
        machine.restoreOptions(optionsMemento);
        System.out.println(machine);
    }

}
