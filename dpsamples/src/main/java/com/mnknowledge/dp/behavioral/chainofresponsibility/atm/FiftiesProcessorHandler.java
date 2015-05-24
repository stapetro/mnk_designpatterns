package com.mnknowledge.dp.behavioral.chainofresponsibility.atm;

public class FiftiesProcessorHandler extends BaseProcessorHandler {

    public FiftiesProcessorHandler(String currency) {
        super(currency);
    }

    public void dispatch(long requestedAmount) {
        long numberofNotesToBeDispatched = requestedAmount / 50;
        if (numberofNotesToBeDispatched > 0) {
            System.out.println(numberofNotesToBeDispatched + " x Fifty " + currency
                    + " are dispatched by FiftiesHandler\n");
        }

        long pendingAmountToBeProcessed = requestedAmount % 50;

        if (pendingAmountToBeProcessed > 0) {
            handler.dispatch(pendingAmountToBeProcessed);

        }

    }
}