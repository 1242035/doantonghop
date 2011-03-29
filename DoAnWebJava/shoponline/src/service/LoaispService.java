package service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import util.jpautil;
import java.util.List;
import model.Loaisp;
import model.Sanpham;
public class LoaispService {
	private EntityManager em;
	public LoaispService(){
		em=jpautil.getenEntityManager();
	}
	public List<Loaisp> findall()
	{
		Query q=em.createQuery("select a from Loaisp a");
		return q.getResultList();
		
	}
	public List<Loaisp> findalllaptop()
	{
		Query q=em.createQuery("select a from Loaisp a where a.hieu=1");
		return q.getResultList();
	}
	public List<Loaisp> findalldienthoai()
	{
		Query q=em.createQuery("select a from Loaisp a where a.hieu=0");
		return q.getResultList();
	}
	//sua lai , chjo xiu ac ac
	public List<Sanpham> findListSPByID(String maloai)
	{
		Loaisp lsp = this.findByID(maloai);
		
		return lsp.getSanphams();
		
	}
	public Loaisp findByID(String maloai)
	{
		return em.find(Loaisp.class,maloai);
		
	}
	
}
