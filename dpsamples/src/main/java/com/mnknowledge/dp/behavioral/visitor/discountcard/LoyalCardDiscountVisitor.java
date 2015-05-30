package com.mnknowledge.dp.behavioral.visitor.discountcard;

/**
 * Calculate loyal client discount visitor.
 *
 * @author siiliev
 *
 */
public class LoyalCardDiscountVisitor implements Visitor {

    private double totalDiscount;

    @Override
    public void visit(Fuel fuel) {
        // apply 5% discount on all fuels
        totalDiscount += 5.0 / 100.0 * fuel.getPrice();
    }

    @Override
    public void visit(Oil oil) {
        // apply 10% discount on all fuels
        totalDiscount += 10.0 / 100.0 * oil.getPrice();
    }

    @Override
    public void visit(Water water) {
        // sorry no discount for water
    }

    public double getTotalDiscount() {
        return totalDiscount;
    }
}
