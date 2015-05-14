package com.mnknowledge.dp.structural.decorator;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		System.out.println("#########################");
		
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		System.out.println("#########################");


		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription());
		System.out.println(beverage.cost());
		System.out.println("#########################");
		
		Beverage beverage2 = new DarkRoast();
		System.out.println(beverage2.getDescription());
		System.out.println(beverage2.cost());
		System.out.println("#########################");
		
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription());
		System.out.println(beverage2.cost());
		System.out.println("#########################");
		
		
	}

}
