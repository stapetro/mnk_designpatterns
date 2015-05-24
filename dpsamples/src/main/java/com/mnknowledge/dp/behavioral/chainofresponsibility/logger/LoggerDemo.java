package com.mnknowledge.dp.behavioral.chainofresponsibility.logger;

public class LoggerDemo {

    public static void main(String[] args) {

        BaseAbstractLogger loggerChain = StandartLogger.getStandartLoggersChain();

        System.out.println("\n ---------------------------------------\n");

        loggerChain.logMessage(BaseAbstractLogger.INFO, "This is an INFO information.");

        System.out.println("\n ---------------------------------------\n");
        loggerChain.logMessage(BaseAbstractLogger.DEBUG, "This is an DEBUG level information.");

        System.out.println("\n ---------------------------------------\n");
        loggerChain.logMessage(BaseAbstractLogger.ERROR, "This is an ERROR information.");
    }

}
