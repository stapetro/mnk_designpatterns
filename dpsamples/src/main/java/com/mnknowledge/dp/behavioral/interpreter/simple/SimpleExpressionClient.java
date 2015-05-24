package com.mnknowledge.dp.behavioral.interpreter.simple;

/**
 * SimpleExpressionClient uses Expression class to create rules. <br>
 * Note: parse trees/rules are static.
 *
 * @author siiliev
 *
 */
public class SimpleExpressionClient {

    // Rule: Ivan and Petar are male
    public Expression getMaleExpression() {
        Expression ivan = new TerminalExpression("Ivan");
        Expression petar = new TerminalExpression("Petar");
        return new OrExpression(ivan, petar);
    }

    // Rule: Maria is a married women
    public Expression getMarriedWomanExpression() {
        Expression maria = new TerminalExpression("Maria");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(maria, married);
    }
}
