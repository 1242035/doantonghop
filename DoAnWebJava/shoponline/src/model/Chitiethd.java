package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the chitiethd database table.
 * 
 */
@Entity
@Table(name="chitiethd")
public class Chitiethd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String macthd;

	private int gia;

	private long soluong;

	//bi-directional many-to-one association to Sanpham
    @ManyToOne
	@JoinColumn(name="masp")
	private Sanpham sanpham;

	//bi-directional many-to-one association to Hoadon
    @ManyToOne
	@JoinColumn(name="mahd")
	private Hoadon hoadon;

    public Chitiethd() {
    }

	public String getMacthd() {
		return this.macthd;
	}

	public void setMacthd(String macthd) {
		this.macthd = macthd;
	}

	public int getGia() {
		return this.gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public long getSoluong() {
		return this.soluong;
	}

	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}

	public Sanpham getSanpham() {
		return this.sanpham;
	}

	public void setSanpham(Sanpham sanpham) {
		this.sanpham = sanpham;
	}
	
	public Hoadon getHoadon() {
		return this.hoadon;
	}

	public void setHoadon(Hoadon hoadon) {
		this.hoadon = hoadon;
	}
	
}