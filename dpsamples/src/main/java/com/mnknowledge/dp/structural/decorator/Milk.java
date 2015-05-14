package com.mnknowledge.dp.structural.decorator;

public class Milk extends CondimentDecorator {

	private Beverage bev;
	
	public Milk(Beverage bev){
		this.bev = bev;
	}
	
	public String getDescription() {
		// TODO Auto-generated method stub
		return bev.getDescription() + " Milk";
	}

	public double cost() {
		// TODO Auto-generated method stub
		return bev.cost() + .1;
	}

}
