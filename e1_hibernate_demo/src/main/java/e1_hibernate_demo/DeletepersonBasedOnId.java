package e1_hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletepersonBasedOnId {

	
	public static void main(String[] args) {
		int id=3;
		// TODO Auto-generated method stub
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager=factory.createEntityManager();
		
		person p=manager.find(person.class, id);
		if(p!=null) {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.remove(p);
			transaction.commit();
			System.out.println("deleted");
		}
		else
			System.out.println("based on id object is not exist");
		
		
	}

}
