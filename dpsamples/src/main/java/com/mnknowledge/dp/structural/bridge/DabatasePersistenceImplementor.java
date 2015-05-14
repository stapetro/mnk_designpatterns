package com.mnknowledge.dp.structural.bridge;



public class DabatasePersistenceImplementor implements PersistenceImplementor {

	public void deleteObject(long objectId) {
		System.out.println("Delete object from DB with id " + objectId);

	}

	public Object getObject(long objectId) {
		System.out.println("Get object from DB with id " + objectId);
		return null;
	}

	public long saveObject(Object object) {

		System.out.println("Save object in DB with id ");
		return 0;

	}

}
