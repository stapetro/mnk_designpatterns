package com.mnknowledge.dp.behavioral.interpreter.calendar;

import java.util.ArrayList;
import java.util.Iterator;

public class RomanCalendarClient {

    private ArrayList<Expression> tree;

    // build static parse tree here...
    public RomanCalendarClient() {
        tree = new ArrayList<Expression>();

        // Build the 'parse tree'
        tree.add(new ThousandExpression());
        tree.add(new HundredExpression());
        tree.add(new TenExpression());
        tree.add(new OneExpression());
    }

    /**
     * Convert or interpret the Roman to Gregorian calendar here...
     *
     * @param context
     */
    public void convert(Context context) {
        // Interpret - recursively
        for (Iterator<Expression> it = tree.iterator(); it.hasNext();) {
            Expression exp = (Expression) it.next();
            exp.interpret(context);
        }
    }
}
