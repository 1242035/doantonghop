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
		Khachhang kh = khsv.findByName(tenkh);

		Hoadon hd = new Hoadon();
		hd.setNgay(new Date());
		hd.setKhachhang(kh);
		
		em.getTransaction().begin();
		em.persist(hd);
		em.getTransaction().commit();
		
		List<Chitiethd> items = new ArrayList<Chitiethd>();
		for(CardItem ci:cardItems) {
			items.add(new Chitiethd(new ChitiethdPK(hd.getMahd(),ci.getSanpham().getMasp()),
					ci.getSanpham().getGia(),
					ci.getQty()));
		}
	
		hd.setChitiethds(items);
		
		em.getTransaction().begin();
		em.merge(hd);
		em.getTransaction().commit();
	}
}
