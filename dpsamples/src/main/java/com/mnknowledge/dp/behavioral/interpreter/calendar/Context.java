package com.mnknowledge.dp.behavioral.interpreter.calendar;

/**
 * Context that keeps both input for Roman calendar and output for Gregorian
 * calendar.
 *
 * @author siiliev
 *
 */
public class Context {

    private String input;
    private int output;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public int getOutput() {
        return output;
    }

    public void setOutput(int output) {
        this.output = output;
    }
}
