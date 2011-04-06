package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import util.jpautil;
import model.CardItem;
import model.Chitiethd;
import model.ChitiethdPK;
import model.Hoadon;
import model.Khachhang;

public class HoadonService {
	private EntityManager em;
	private KhachhangService khsv;
	public HoadonService() {
		khsv = new KhachhangService();
		em = jpautil.getenEntityManager();
	}
	
	public void create(Collection<CardItem> cardItems , String tenkh){
		
//		for(CardItem ci : cardItems){
//			System.out.print("->" + ci.getSanpham().getTensp());
//		}
		
		//System.out.print("->" + tenkh);
		Khachhang kh = khsv.findByName(tenkh);
//		
		//System.out.print("->" + kh.getEmail() + "\n" + kh.getPhone());
		
		Hoadon hd = new Hoadon();
		hd.setNgay(new Date());
		hd.setKhachhang(kh);
		
		em.getTransaction().begin();
		em.persist(hd);
		em.getTransaction().commit();
		
		List<Chitiethd> items = new ArrayList<Chitiethd>();
		for(CardItem ci:cardItems) {
			ChitiethdPK newPK = new ChitiethdPK(hd.getMahd(),ci.getSanpham().getMasp());
			items.add(new Chitiethd((newPK),ci.getSanpham().getGia(),ci.getQty()));
		}
	
		hd.setChitiethds(items);
		em.getTransaction().begin();
		em.merge(hd);
		em.getTransaction().commit();
	}
}
