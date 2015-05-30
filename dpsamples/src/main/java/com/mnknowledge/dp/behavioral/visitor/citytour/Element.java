package com.mnknowledge.dp.behavioral.visitor.citytour;

/**
 * Visitable element - part of Visitor Pattern.
 *
 * @author siiliev
 *
 */
interface Element {
    public void accept(Visitor visitor);
}
