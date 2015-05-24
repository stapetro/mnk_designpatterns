package com.mnknowledge.dp.behavioral.chainofresponsibility.atm;

public abstract class BaseProcessorHandler {
    BaseProcessorHandler handler;
    String currency;

    public BaseProcessorHandler(String currency) {
        super();
        this.currency = currency;
    }

    public void nextHandler(BaseProcessorHandler handler) {
        this.handler = handler;
    }

    public abstract void dispatch(long requestedAmount);
}