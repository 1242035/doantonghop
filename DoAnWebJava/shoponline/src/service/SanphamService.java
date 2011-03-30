package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;


import model.Sanpham;

import util.jpautil;

public class SanphamService {
	private EntityManager em;
	public SanphamService(){
		em=jpautil.getenEntityManager();
	}
	public List<Sanpham> findall()
	{
		Query q=em.createQuery("select a from Sanpham a");
		return q.getResultList();
		
	}
	public List<Sanpham> findgd(String tensp)
	{
		Query q=em.createQuery("select a from Sanpham a where a.tensp like :tensp");
		q.setParameter("tensp", "%"+tensp+"%");
		return q.getResultList();
		
	}
	public List<Sanpham> showsp(String masp)
	{
		Query q=em.createQuery("select a from Sanpham a where a.masp=:masp");
		q.setParameter("masp", masp);
		return q.getResultList();
	}
	public List<Sanpham> showmax()
	{
		Query q=em.createQuery("select a from Sanpham a order by a.gia asc limit 1,1");
		return q.getResultList();
		
	}
	
}
