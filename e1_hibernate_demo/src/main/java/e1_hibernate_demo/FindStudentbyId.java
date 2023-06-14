package e1_hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FindStudentbyId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int id=2;
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager=factory.createEntityManager();
		// trying to retrieve data from database
		
		person p= manager.find(person.class, id);
		System.out.println(p);
	}

}
