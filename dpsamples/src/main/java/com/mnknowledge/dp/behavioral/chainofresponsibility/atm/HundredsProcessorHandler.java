package com.mnknowledge.dp.behavioral.chainofresponsibility.atm;

public class HundredsProcessorHandler extends BaseProcessorHandler {

    public HundredsProcessorHandler(String currency) {
        super(currency);
    }

    public void dispatch(long requestedAmount) {
        long numberofNotesToBeDispatched = requestedAmount / 100;
        if (numberofNotesToBeDispatched > 0) {
            System.out.println(numberofNotesToBeDispatched + " x Hundred " + currency
                    + " are dispatched by HundredsHandler\n");
        }

        long pendingAmountToBeProcessed = requestedAmount % 100;

        if (pendingAmountToBeProcessed > 0) {
            handler.dispatch(pendingAmountToBeProcessed);

        }

    }

}
