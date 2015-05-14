package com.mnknowledge.dp.structural.bridge;

public class PersistenceFrameworkDriver {

	public static void main(String[] args) {

		PersistenceImplementor implementor = null;

		if (databaseDriverExists()) {

			implementor = new DabatasePersistenceImplementor();

		} else {

			implementor = new FileSystemPersistenceImplementor();
		}

		Persistence persistenceAPI = new PersistenceImp(implementor);

		Object o = persistenceAPI.findById("12343755");
		persistenceAPI.persist(o);
		
		System.out.println("###########################");

		persistenceAPI = new PersistenceImp(
				new DabatasePersistenceImplementor());

		persistenceAPI.deleteById("2323");
		persistenceAPI.findById("1235");

	}

	private static boolean databaseDriverExists() {

		return false;
	}

}
