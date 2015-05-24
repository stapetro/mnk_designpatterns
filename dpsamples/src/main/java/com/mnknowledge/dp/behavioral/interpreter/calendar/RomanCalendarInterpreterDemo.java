package com.mnknowledge.dp.behavioral.interpreter.calendar;

public class RomanCalendarInterpreterDemo {

    /**
     * @param args
     */
    public static void main(String[] args) {

        RomanCalendarClient client = new RomanCalendarClient();

        // let's try it once
        String romanTest1 = "MCMXXXVII";
        Context context1 = new Context(romanTest1);
        client.convert(context1);
        System.out.println(romanTest1 + " = " + Integer.toString(context1.getOutput()));

        // let's try it again
        String romanTest2 = "MCMXLVII";
        Context context2 = new Context(romanTest2);
        client.convert(context2);
        System.out.println(romanTest2 + " = " + Integer.toString(context2.getOutput()));

        // let's try it last time
        String romanTest3 = "MCMCXV";
        Context context3 = new Context(romanTest3);
        client.convert(context3);
        System.out.println(romanTest3 + " = " + Integer.toString(context3.getOutput()));
    }
}
