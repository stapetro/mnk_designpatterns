package com.mnknowledge.dp.behavioral.visitor.discountcard;

/**
 * Note: concrete element in context of Visitor pattern.
 *
 * @author siiliev
 *
 */
public class Fuel implements Product, Visitable {

    private String name;
    private double pricePerLitre;
    private int liter;

    public Fuel(String name, double pricePerLitre, int liter) {
        this.name = name;
        this.pricePerLitre = pricePerLitre;
        this.liter = liter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public int getLiter() {
        return liter;
    }

    public void setLiter(int liter) {
        this.liter = liter;
    }

    @Override
    public double getPrice() {
        return pricePerLitre * liter;
    }

    @Override
    public int getCount() {
        return liter;
    }

    // accept the visitor
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
