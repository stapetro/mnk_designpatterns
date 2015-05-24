package com.mnknowledge.dp.behavioral.interpreter.calculator;

public class ExpressionCalculatorDemo {
    public static void main(String[] args) {
        ExpressionCalculatorClient calc = new ExpressionCalculatorClient();
        // instantiate the context
        Context ctx = new Context();

        // set the expression to evaluate
        calc.setExpression("(a+b)*(c-d)");

        // configure the calculator with the
        // Context
        calc.setContext(ctx);

        // Display the result
        System.out.println(" Variable Values: " + "a=" + ctx.getValue("a") + ", b=" + ctx.getValue("b") + ", c="
                + ctx.getValue("c") + ", d=" + ctx.getValue("d"));
        System.out.println(" Expression = (a+b)*(c-d)");
        System.out.println(" Result = " + calc.evaluate());

        // lets try it again
        // instantiate the context
        System.out.println(" ---------------- ");
        Context ctx2 = new Context(2, 2, 2, 2);

        // set the expression to evaluate
        calc.setExpression("(a+b)*(c+d)");

        // configure the calculator with the
        // Context
        calc.setContext(ctx2);

        // Display the result
        System.out.println(" Variable Values: " + "a=" + ctx2.getValue("a") + ", b=" + ctx2.getValue("b") + ", c="
                + ctx2.getValue("c") + ", d=" + ctx2.getValue("d"));
        System.out.println(" Expression = (a+b)*(c+d)");
        System.out.println(" Result = " + calc.evaluate());
    }
}
