package e1_hibernate_demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RetrieveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager=factory.createEntityManager();
		
		
		//select* from person=====sql query
		//select p from person p==== jpql query
		
		String query="select p from person p";
		Query res=manager.createQuery(query);
		
		List<person> p=res.getResultList();
		System.out.println(p);

	}

}
