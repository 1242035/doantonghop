package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the hoadon database table.
 * 
 */
@Entity
@Table(name="hoadon")
public class Hoadon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int mahd;

    @Temporal( TemporalType.DATE)
	private Date ngay;

	//bi-directional many-to-one association to Chitiethd
	@OneToMany(mappedBy="hoadon")
	private List<Chitiethd> chitiethds;

	//bi-directional many-to-one association to Khachhang
    @ManyToOne
	@JoinColumn(name="tenkh")
	private Khachhang khachhang;

    public Hoadon() {
    }

	public int getMahd() {
		return this.mahd;
	}

	public void setMahd(int mahd) {
		this.mahd = mahd;
	}

	public Date getNgay() {
		return this.ngay;
	}

	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}

	public List<Chitiethd> getChitiethds() {
		return this.chitiethds;
	}

	public void setChitiethds(List<Chitiethd> chitiethds) {
		this.chitiethds = chitiethds;
	}
	
	public Khachhang getKhachhang() {
		return this.khachhang;
	}

	public void setKhachhang(Khachhang khachhang) {
		this.khachhang = khachhang;
	}
	
}