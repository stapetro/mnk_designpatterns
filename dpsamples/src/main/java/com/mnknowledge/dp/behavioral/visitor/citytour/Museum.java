package com.mnknowledge.dp.behavioral.visitor.citytour;

/**
 * Note: concrete element in context of Visitor Pattern.
 *
 * @author siiliev
 *
 */
public class Museum implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Museum is accepting visitor.");
        visitor.visit(this);
    }
}