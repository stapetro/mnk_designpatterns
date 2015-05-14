package com.mnknowledge.dp.structural.adapter;

public class TwoWayAdapter implements Duck, Turkey {
	
	Duck duck;
	Turkey turkey;
	
	public TwoWayAdapter(Duck duck) {
		this.duck = duck;
	}
	
	public TwoWayAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void gobble() {
		if(turkey != null) {
			turkey.gobble();
		} else {
			duck.quack();
		}
	}

	public void quack() {
		gobble();

	}

	public void fly() {
		if(turkey != null) {
			turkey.fly();
		} else {
			duck.fly();
		}
	}

}
