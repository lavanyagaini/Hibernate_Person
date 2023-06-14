package e1_hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class personSave {
	

	public static void main(String[] args) {

		person person1 = new person();
		// person.setId(0);
		person1.setFirstName("Gaini");
		person1.setLastName("krishna");
		person1.setEmail("krishna@gmail.com");
		person1.setNumber(34567890);
		person1.setPwd("12345");
		

		// to access the data present in persistence.xml
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");

		// to perform or use of hibernate inbuild methods
		EntityManager manager = factory.createEntityManager();

		// to track the process of sending data to database
		EntityTransaction transcation = manager.getTransaction();
		// to start transaction
		transcation.begin();

		// for saving there is an inbuilt method present in EM
		manager.persist(person1);

		// to end transaction
		transcation.commit();
	}

}