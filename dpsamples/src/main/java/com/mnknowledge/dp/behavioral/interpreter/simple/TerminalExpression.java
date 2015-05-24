package com.mnknowledge.dp.behavioral.interpreter.simple;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
