package com.mnknowledge.dp.behavioral.interpreter.calculator;

import java.util.HashMap;

public class Context {

    private HashMap<String, Integer> varList = new HashMap<String, Integer>();

    public Context(int a, int b, int c, int d) {
        assign("a", a);
        assign("b", b);
        assign("c", c);
        assign("d", d);
    }

    public void assign(String var, int value) {
        varList.put(var, new Integer(value));
    }

    public int getValue(String var) {
        Integer objInt = (Integer) varList.get(var);
        return objInt.intValue();
    }

    public Context() {
        initialize();
    }

    // Have some values hard coded to keep the example simple
    private void initialize() {
        assign("a", 20);
        assign("b", 40);
        assign("c", 30);
        assign("d", 10);
    }
}
