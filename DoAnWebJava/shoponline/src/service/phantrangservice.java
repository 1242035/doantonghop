package service;

import java.util.List;
import java.sql.*;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Sanpham;

import util.jpautil;

public class phantrangservice {
	
	

	private EntityManager em;
	public phantrangservice(){
		em=jpautil.getenEntityManager();

	
	}
	public List<Sanpham> findall()
	{
		Query q=em.createQuery("select count(a) from Sanpham a");
		List<Sanpham>hang=q.getResultList();
		return hang;
	}
	
	
}
