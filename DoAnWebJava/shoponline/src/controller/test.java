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
		SanphamService sp=new SanphamService();
		for (Sanpham s : sp.showmax()) {
			System.out.println(s.getGia());
		}
		
	}
}

