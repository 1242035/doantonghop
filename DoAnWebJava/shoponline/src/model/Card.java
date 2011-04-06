package model;

import java.io.Serializable;
import java.util.Hashtable;

public class Card implements Serializable{
	private Hashtable<String, CardItem> items;
	public Card() {
		items = new Hashtable<String, CardItem>();
		
	}
	
	public void add(Sanpham sp, Integer qty) {
		items.put(sp.getMasp(),new CardItem(sp,qty));
	}
	public void add(String id, Integer qty ) {
		if(items.containsKey(id)) {
			CardItem item = items.get(id);
			item.setQty(item.getQty()+qty);
		}
	}
	
	public void update(String id,Integer qty) {
		if(items.containsKey(id)){
			CardItem item = items.get(id);
			item.setQty(qty);
		}
	}
	
	public void remove(String id){
		if(items.containsKey(id)){
			items.remove(id);
		}
	}

	public Hashtable<String, CardItem> getItems() {
		return items;
	}
	
	public boolean checkSanpham(String id) {
		return items.containsKey(id);
	}
	
	public int getTotal() {
		int total = 0;
		for(CardItem item:items.values()) {
			total += item.getSanpham().getGia()*item.getQty();
		}
		return total;
	}
	
	public int getCound(){
		return items.size();
	}
	
	public void removeAll() {
		items.clear();
	}
}
