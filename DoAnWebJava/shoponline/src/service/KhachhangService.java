package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Khachhang;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;


import util.jpautil;

public class KhachhangService {
	private EntityManager em;
	
	public KhachhangService() {
		// TODO Auto-generated constructor stub
		em=jpautil.getenEntityManager();
	}
	
	/**
	 * create entity
	 * @return
	 */
	
	public boolean createKhachhang(Khachhang kh){
		try{
			em.getTransaction().begin();
			em.persist(kh);
			em.getTransaction().commit();
			return true;
		}
		catch(Exception e){
			System.out.print("Error when creating from KhachhangService");
		}
		return false;
	}
	
	public boolean createKhachhang(String tenkh, String dchi, String phone, String email, String pass){
		try{
			em.getTransaction().begin();
			
			Khachhang kh = new Khachhang();
			kh.setTenkh(tenkh);
			kh.setDchi(dchi);
			kh.setEmail(email);
			kh.setPass(pass);
			kh.setPhone(phone);
			
			em.persist(kh);
			
			em.getTransaction().commit();
			return true;
		}
		catch(Exception e){
			System.out.print("Error when creating from KhachhangService");
		}
		return false;
	}
	
	/**
	 * find entity
	 * @return
	 */
	public List<Khachhang> findAll()
	{
		Query q=em.createQuery("select a from Khachhang a");
		return q.getResultList();
		
	}
	
	public Khachhang findByName(String name){
		return em.find(Khachhang.class,name);
	}
	
	/*public Khachhang findByName(String tenkh){
		Query q = em.createQuery("select a from Khachhang a where a.tenkh=:tenkh");
		q.setParameter("tenkh", tenkh);
		return (Khachhang)q.getSingleResult();
	}
	
	public boolean checkKHInList(String tenkh){
		Query q = em.createQuery("select a from Khachhang a where a.tenkh=:tenkh");
		q.setParameter("tenkh", tenkh);
		Khachhang kh = (Khachhang)q.getSingleResult();
		if(kh == null)return 
	}*/
}
