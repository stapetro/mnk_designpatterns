package com.mnknowledge.dp.structural.bridge;

// Abstract class contains a reference to the abstract implementation class
public abstract class Persistence {
	
	protected PersistenceImplementor implementor = null;
	
	public Persistence(PersistenceImplementor impl) {
		implementor = impl;
	}
	
	public abstract String persist(Object object);

	public abstract Object findById(String objectId);

	public abstract void deleteById(String id);

}
