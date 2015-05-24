package com.mnknowledge.dp.behavioral.chainofresponsibility.logger;

public class StdOutBasedLogger extends BaseAbstractLogger {

    public StdOutBasedLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("StdOut: " + msg);
    }
}
