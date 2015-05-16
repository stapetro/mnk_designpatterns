package com.mnknowledge.dp.creational.builder.car;

/**
 * Specific implementation of CarBuilder object for Ford Mondeo cars
 * constructing/building.
 *
 * @author siiliev
 *
 */
public class BMWX6Builder extends CarBuilder {
    public BMWX6Builder() {
        make("BMW");
        model("X6");
    }
    // may add other helper methods here
}
