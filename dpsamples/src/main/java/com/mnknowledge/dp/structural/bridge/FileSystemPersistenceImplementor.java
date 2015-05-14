package com.mnknowledge.dp.structural.bridge;


public class FileSystemPersistenceImplementor implements PersistenceImplementor {

	public void deleteObject(long objectId) {
		System.out.println("Delete object from file with id " + objectId);

	}

	public Object getObject(long objectId) {
		System.out.println("Get object from file with id " + objectId);
		return null;
	}

	public long saveObject(Object object) {
		System.out.println("Save object in file with id ");
		return 0;

	}

}
