package com.mnknowledge.dp.behavioral.chainofresponsibility.atm;

public class TensProcessorHandler extends BaseProcessorHandler {

    public TensProcessorHandler(String currency) {
        super(currency);
    }

    public void dispatch(long requestedAmount) {
        long numberofNotesToBeDispatched = requestedAmount / 10;

        if (numberofNotesToBeDispatched > 0) {
            System.out.println(numberofNotesToBeDispatched + " x Ten " + currency + " are dispatched by TensHandler\n");
        }

        long pendingAmountToBeProcessed = requestedAmount % 10;

        if (pendingAmountToBeProcessed > 0) {
            handler.dispatch(pendingAmountToBeProcessed);

        }

    }
}
