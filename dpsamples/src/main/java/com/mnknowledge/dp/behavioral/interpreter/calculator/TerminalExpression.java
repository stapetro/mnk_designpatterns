package com.mnknowledge.dp.behavioral.interpreter.calculator;

public class TerminalExpression implements Expression {

    private String var;

    public TerminalExpression(String v) {
        var = v;
    }

    public int evaluate(Context c) {
        return c.getValue(var);
    }
}
