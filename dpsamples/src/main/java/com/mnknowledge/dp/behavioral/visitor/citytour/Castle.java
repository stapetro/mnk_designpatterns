package com.mnknowledge.dp.behavioral.visitor.citytour;

/**
 * Note: concrete element in context of Visitor Pattern.
 *
 * @author siiliev
 *
 */
public class Castle implements Element {
    @Override
    public void accept(Visitor visitor) {
        System.out.println("Castle is accepting visitor.");
        visitor.visit(this);
    }

}
