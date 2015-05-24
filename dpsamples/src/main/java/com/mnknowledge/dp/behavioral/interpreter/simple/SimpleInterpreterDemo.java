package com.mnknowledge.dp.behavioral.interpreter.simple;

public class SimpleInterpreterDemo {

    public static void main(String[] args) {

        SimpleExpressionClient client = new SimpleExpressionClient();

        Expression isMale = client.getMaleExpression();
        Expression isMarriedWoman = client.getMarriedWomanExpression();

        System.out.println("Ivan is male? " + isMale.interpret("Ivan"));
        System.out.println("Maria is male? " + isMale.interpret("Stoyan"));
        System.out.println("Maria is a married women? " + isMarriedWoman.interpret("Maria is Married"));
        System.out.println("Petya is a married women? " + isMarriedWoman.interpret("Petya is Married"));
    }
}
