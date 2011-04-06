package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the khachhang database table.
 * 
 */
@Entity
@Table(name="khachhang")
public class Khachhang implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String tenkh;

	private String dchi;

    @Lob()
	private String email;

	private String pass;

	private String phone;

	//bi-directional many-to-one association to Hoadon
	@OneToMany(mappedBy="khachhang")
	private List<Hoadon> hoadons;

    public Khachhang() {
    }

	public String getTenkh() {
		return this.tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

	public String getDchi() {
		return this.dchi;
	}

	public void setDchi(String dchi) {
		this.dchi = dchi;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Hoadon> getHoadons() {
		return this.hoadons;
	}

	public void setHoadons(List<Hoadon> hoadons) {
		this.hoadons = hoadons;
	}
	
}