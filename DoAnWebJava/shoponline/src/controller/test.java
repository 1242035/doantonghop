package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.CardItem;
import model.Chitiethd;
import model.ChitiethdPK;
import model.Hoadon;
import model.Khachhang;
import model.Loaisp;
import model.Sanpham;

import service.KhachhangService;
import service.LoaispService;
import service.SanphamService;
import service.phantrangservice;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("shoponline");
		EntityManager em = emf.createEntityManager();
		
		KhachhangService khsv = new KhachhangService();
		SanphamService spsv = new SanphamService();
////		
		Khachhang kh = khsv.findByName("Duc");
		Sanpham sp = spsv.findSanPhamByID("28");
////
		Hoadon hd = new Hoadon();
		hd.setNgay(new Date());
		hd.setKhachhang(kh);
////		
		em.getTransaction().begin();
		em.persist(hd);
		em.getTransaction().commit();
////		
//		List<Chitiethd> items = new ArrayList<Chitiethd>();
//
//		hd.setChitiethds(items);
//		items.add(new Chitiethd(new ChitiethdPK(1, "28"), 30, 2));
//		hd.setChitiethds(items);
//		
//		em.getTransaction().begin();
//		em.merge(hd);
//		em.getTransaction().commit();
//
	

		
		ChitiethdPK pk = new ChitiethdPK(hd.getMahd(),sp.getMasp());
		Chitiethd x = new Chitiethd();
		x.setGia(3000);
		x.setSoluong(3);
		x.setId(pk);
		
		em.getTransaction().begin();
		em.persist(x);
		em.getTransaction().commit();
	}
}

