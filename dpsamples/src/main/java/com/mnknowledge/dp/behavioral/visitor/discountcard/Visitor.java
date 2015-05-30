package com.mnknowledge.dp.behavioral.visitor.discountcard;

/**
 * Visitor interface.
 *
 * @author siiliev
 *
 */
public interface Visitor {
    public void visit(Oil fuel);

    public void visit(Fuel oil);

    public void visit(Water water);
}
