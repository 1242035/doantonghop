package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the loaisp database table.
 * 
 */
@Entity
@Table(name="loaisp")
public class Loaisp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String maloai;

	private int hieu;

	private String tenloai;

	//bi-directional many-to-one association to Sanpham
	@OneToMany(mappedBy="loaisp")
	private List<Sanpham> sanphams;

    public Loaisp() {
    }

	public String getMaloai() {
		return this.maloai;
	}

	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}

	public int getHieu() {
		return this.hieu;
	}

	public void setHieu(int hieu) {
		this.hieu = hieu;
	}

	public String getTenloai() {
		return this.tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

	public List<Sanpham> getSanphams() {
		return this.sanphams;
	}

	public void setSanphams(List<Sanpham> sanphams) {
		this.sanphams = sanphams;
	}
	
}