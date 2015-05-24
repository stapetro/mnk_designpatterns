package com.mnknowledge.dp.behavioral.chainofresponsibility.atm;

public class FivesProcessorHandler extends BaseProcessorHandler {

    public FivesProcessorHandler(String currency) {
        super(currency);
    }

    public void dispatch(long requestedAmount) {
        long numberofNotesToBeDispatched = requestedAmount / 5;
        if (numberofNotesToBeDispatched > 0) {
            System.out.println(numberofNotesToBeDispatched + " x Five " + currency
                    + " are dispatched by FivesHandler\n");
        }

        long pendingAmountToBeProcessed = requestedAmount % 5;

        if (pendingAmountToBeProcessed > 0) {
            handler.dispatch(pendingAmountToBeProcessed);

        }

    }
}