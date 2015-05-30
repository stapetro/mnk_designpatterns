package com.mnknowledge.dp.behavioral.visitor.discountcard;

/**
 * Visitable element - part of Visitor Pattern.
 *
 * @author siiliev
 *
 */
public interface Visitable {
    public void accept(Visitor visitor);
}