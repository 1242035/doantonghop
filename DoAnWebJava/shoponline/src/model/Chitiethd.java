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

	@EmbeddedId
	private ChitiethdPK id;

	private long gia;

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

    public Chitiethd(ChitiethdPK id, long gia,long soluong) {
		super();
		this.id = id;
		this.gia = gia;
		this.soluong = soluong;
	}
    
	public ChitiethdPK getId() {
		return this.id;
	}

	public void setId(ChitiethdPK id) {
		this.id = id;
	}
	
	public long getGia() {
		return this.gia;
	}

	public void setGia(long gia) {
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