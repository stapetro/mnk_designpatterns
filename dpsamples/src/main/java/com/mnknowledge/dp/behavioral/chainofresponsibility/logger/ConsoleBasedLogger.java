package com.mnknowledge.dp.behavioral.chainofresponsibility.logger;

public class ConsoleBasedLogger extends BaseAbstractLogger {

    public ConsoleBasedLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("Console: " + msg);
    }
}
