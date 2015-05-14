package com.mnknowledge.dp.structural.bridge;

public class PersistenceImp extends Persistence {

	public PersistenceImp(PersistenceImplementor impl) {

		super(impl);

	}

	public String persist(Object object) {
		return Long.toString(implementor.saveObject(object));
	}

	public Object findById(String objectId) {
		return implementor.getObject(Long.parseLong(objectId));
	}

	public void deleteById(String objectId) {
		implementor.deleteObject(Long.parseLong(objectId));

	}

}
