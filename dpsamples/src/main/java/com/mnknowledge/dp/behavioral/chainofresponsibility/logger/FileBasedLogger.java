package com.mnknowledge.dp.behavioral.chainofresponsibility.logger;

public class FileBasedLogger extends BaseAbstractLogger {

    public FileBasedLogger(int level) {
        this.level = level;
    }

    @Override
    protected void displayLogInfo(String msg) {
        System.out.println("File logger: " + msg);
    }
}
