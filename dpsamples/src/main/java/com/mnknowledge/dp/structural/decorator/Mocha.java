package com.mnknowledge.dp.structural.decorator;

public class Mocha extends CondimentDecorator {
	
	private Beverage beverige;
	
	public Mocha(Beverage beverige) {
		this.beverige = beverige;
	}

	public String getDescription() {
		return beverige.getDescription() + " , Mocha";
	}

	public double cost() {
		return beverige.cost() + .20;
	}

}
