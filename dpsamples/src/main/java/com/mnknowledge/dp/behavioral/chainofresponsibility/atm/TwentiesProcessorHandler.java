package com.mnknowledge.dp.behavioral.chainofresponsibility.atm;

public class TwentiesProcessorHandler extends BaseProcessorHandler {

    public TwentiesProcessorHandler(String currency) {
        super(currency);
    }

    public void dispatch(long requestedAmount) {
        long numberofNotesToBeDispatched = requestedAmount / 20;

        if (numberofNotesToBeDispatched > 0) {
            System.out.println(numberofNotesToBeDispatched + " x Twenty " + currency
                    + " are dispatched by TwentiesHandler\n");
        }

        long pendingAmountToBeProcessed = requestedAmount % 20;

        if (pendingAmountToBeProcessed > 0) {
            handler.dispatch(pendingAmountToBeProcessed);

        }

    }
}
