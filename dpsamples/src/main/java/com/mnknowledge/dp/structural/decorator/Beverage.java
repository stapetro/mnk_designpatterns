package com.mnknowledge.dp.structural.decorator;

public abstract class Beverage {

	protected String description = "Unknown type";

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}
