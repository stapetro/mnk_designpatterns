package com.mnknowledge.dp.behavioral.chainofresponsibility.logger;

public abstract class BaseAbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected BaseAbstractLogger nextLevelLogger;

    public void setNextLevelLogger(BaseAbstractLogger nextLevelLogger) {
        this.nextLevelLogger = nextLevelLogger;
    }

    public void logMessage(int levels, String msg) {

        if (this.level <= levels) {
            displayLogInfo(msg);
        }

        if (nextLevelLogger != null) {
            nextLevelLogger.logMessage(levels, msg);
        }
    }

    protected abstract void displayLogInfo(String msg);

}
