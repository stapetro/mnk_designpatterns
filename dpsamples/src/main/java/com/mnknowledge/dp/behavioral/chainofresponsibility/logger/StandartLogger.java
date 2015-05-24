package com.mnknowledge.dp.behavioral.chainofresponsibility.logger;

public class StandartLogger {

    public static BaseAbstractLogger getStandartLoggersChain() {

        BaseAbstractLogger fileLogger = new FileBasedLogger(BaseAbstractLogger.INFO);
        BaseAbstractLogger errorLogger = new StdOutBasedLogger(BaseAbstractLogger.DEBUG);
        BaseAbstractLogger consoleLogger = new ConsoleBasedLogger(BaseAbstractLogger.ERROR);

        fileLogger.setNextLevelLogger(errorLogger);
        errorLogger.setNextLevelLogger(consoleLogger);

        return fileLogger;
    }
}
