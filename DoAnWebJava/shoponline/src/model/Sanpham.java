package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the sanpham database table.
 * 
 */
@Entity
@Table(name="sanpham")
public class Sanpham implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String masp;

	private long gia;

	private String hinhanh;

    @Lob()
	private String mota;

	private String tensp;

	//bi-directional many-to-one association to Chitiethd
	@OneToMany(mappedBy="sanpham")
	private List<Chitiethd> chitiethds;

	//bi-directional many-to-one association to Loaisp
    @ManyToOne
	@JoinColumn(name="maloai")
	private Loaisp loaisp;

    public Sanpham() {
    }

	public String getMasp() {
		return this.masp;
	}

	public void setMasp(String masp) {
		this.masp = masp;
	}

	public long getGia() {
		return this.gia;
	}

	public void setGia(long gia) {
		this.gia = gia;
	}

	public String getHinhanh() {
		return this.hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public String getTensp() {
		return this.tensp;
	}

	public void setTensp(String tensp) {
		this.tensp = tensp;
	}

	public List<Chitiethd> getChitiethds() {
		return this.chitiethds;
	}

	public void setChitiethds(List<Chitiethd> chitiethds) {
		this.chitiethds = chitiethds;
	}
	
	public Loaisp getLoaisp() {
		return this.loaisp;
	}

	public void setLoaisp(Loaisp loaisp) {
		this.loaisp = loaisp;
	}
	
}