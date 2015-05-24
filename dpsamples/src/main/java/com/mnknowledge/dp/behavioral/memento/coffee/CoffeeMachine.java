package com.mnknowledge.dp.behavioral.memento.coffee;

import java.util.Arrays;

/**
 * originator
 */
public class CoffeeMachine {

    private static final int LONG_COFFEE = 0;
    private static final int SHORT_COFFEE = 1;
    private static final int WITH_MILK = 2;
    private static final int WITH_SUGAR = 3;
    private static final String OPTION_NAMES[] = {"Long coffee", "Short coffee", "With Milk", "With Sugar"};

    private boolean[] options = new boolean[4];
    
    public CoffeeMachine longCoffee() {
        options[LONG_COFFEE] = true;
        return this;
    }

    public CoffeeMachine shortCoffee() {
        options[SHORT_COFFEE] = true;
        return this;
    }

    public CoffeeMachine withMilk() {
        options[WITH_MILK] = true;
        return this;
    }

    public CoffeeMachine withSugar() {
        options[WITH_SUGAR] = true;
        return this;
    }

    public void clearCoffePreferences() {
        for (int index = 0; index < options.length; index++) {
            options[index] = false;
        }
    }

    public CoffeeOptionsMemento saveOptions() {
        return new CoffeeOptionsMemento(this.options);
    }

    public void restoreOptions(CoffeeOptionsMemento memento) {
        this.options = Arrays.copyOf(memento.getOptions(), memento.getOptions().length);
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("Coffe machine options are: ");
        boolean addedToOutput = false;
        for(int index = 0; index < options.length; index++) {
            if(options[index]) {
                if(!addedToOutput) {
                    addedToOutput = true;
                    output.append(OPTION_NAMES[index]);
                } else {
                    output.append(", ").append(OPTION_NAMES[index]);
                }
            }
        }
        if(addedToOutput) {
            return output.toString();
        } else {
            return "No coffee options are selected!";
        }
    }

    public static class CoffeeOptionsMemento {
        private boolean[] options;

        private CoffeeOptionsMemento(boolean[] options) {
            // this.options = options;
            this.options = Arrays.copyOf(options, options.length);
        }

        private boolean[] getOptions() {
            return this.options;
        }
    }
}
