package e1_hibernate_demo;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;





public class RetrieveBasedOnEmail {
	
	public static void main(String []args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager=factory.createEntityManager();
		
		//select*from person where email=?,phone=? ==sql
		
		//select p from person p where p.email=value
		
		String query="select p from person p where p.email=?1";
		Query res=manager.createQuery(query);
		res.setParameter(1,"lavanya@gmail.com");
		
		
		person p=(person)res.getSingleResult();
		System.out.println(p);
		
		
	}

}
