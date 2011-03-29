package controller;

import model.Loaisp;
import model.Sanpham;
import service.LoaispService;
import service.SanphamService;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tensp="LG";
		SanphamService sp=new SanphamService();
		for (Sanpham s : sp.findgd(tensp)) {
				System.out.println(s.getMasp());
				System.out.println(s.getTensp());
				System.out.println(s.getHinhanh());
				
				System.out.println(s.getGia());
				System.out.println("------------");
		}
		
	}
}

