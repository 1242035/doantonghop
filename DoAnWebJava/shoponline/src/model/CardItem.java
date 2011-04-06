package model;

import java.io.Serializable;

public class CardItem implements Serializable {
	private Sanpham sp;
	private int qty;
	public Sanpham getSanpham() {
		return sp;
	}
	public void setSanpham(Sanpham sp) {
		this.sp = sp;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public CardItem() {
		
	}
	public CardItem(Sanpham sp, int qty) {		
		this.sp = sp;
		this.qty = qty;
	}
	
}
