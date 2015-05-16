package com.mnknowledge.dp.creational.builder.car;

/**
 * Specific implementation of CarBuilder object for Ford Mondeo cars
 * constructing/building.
 *
 * @author siiliev
 *
 */
public class FordMondeoBuilder extends CarBuilder {
    public FordMondeoBuilder() {
        make("Ford");
        model("Mondeo");
    }
    // may add other helper methods here
}
