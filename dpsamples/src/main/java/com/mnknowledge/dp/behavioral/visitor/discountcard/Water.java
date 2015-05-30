package com.mnknowledge.dp.behavioral.visitor.discountcard;

/**
 * Note: concrete element in context of Visitor pattern.
 *
 * @author siiliev
 *
 */
public class Water implements Product, Visitable {

    private String name;
    private double pricePerPack;
    private int packs;

    public Water(String name, double pricePerPack, int packs) {
        this.name = name;
        this.pricePerPack = pricePerPack;
        this.packs = packs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerPack() {
        return pricePerPack;
    }

    public void setPricePerPack(double pricePerPack) {
        this.pricePerPack = pricePerPack;
    }

    public int getPacks() {
        return packs;
    }

    public void setPacks(int packs) {
        this.packs = packs;
    }

    @Override
    public double getPrice() {
        return pricePerPack * packs;
    }

    @Override
    public int getCount() {
        return packs;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
