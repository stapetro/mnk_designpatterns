package com.mnknowledge.dp.structural.bridge;


//Defines the interface for implementation classes (Implementer)
public interface PersistenceImplementor {
	public long saveObject(Object object);

	public void deleteObject(long objectId);

	public Object getObject(long objectId);
}
