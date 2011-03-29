package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpautil {
	private static final EntityManagerFactory emf;
	static
	{
		emf=Persistence.createEntityManagerFactory("shoponline");
		
	}
	public static EntityManager getenEntityManager()
	{
		return emf.createEntityManager();
	}
	
}
