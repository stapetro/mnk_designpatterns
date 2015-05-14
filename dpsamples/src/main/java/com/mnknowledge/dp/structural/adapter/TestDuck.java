package com.mnknowledge.dp.structural.adapter;


public class TestDuck {
	
	static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	public static void main(String[] args) {
		Turkey wt = new WildTurkey();
		TurkeyAdapter tad = new TurkeyAdapter(wt);
		testDuck(tad);
		
		System.out.println("###################################");
		Duck duck = new MallardDuck();
		testDuck(duck);
	}

}
