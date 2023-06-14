package e1_hibernate_demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdatePersonBasedOnId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id=3;
		person p=new person();
		p.setFirstName("gaini"); 
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager=factory.createEntityManager();
		
		person dbperson=manager.find(person.class, id);
		if(dbperson!=null) {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.merge(p);
			transaction.commit();
			System.out.println("updated");
			
		}

	}

}
