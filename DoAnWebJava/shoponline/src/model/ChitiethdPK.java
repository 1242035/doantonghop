package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the chitiethd database table.
 * 
 */
@Embeddable
public class ChitiethdPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int mahd;

	private String masp;

    public ChitiethdPK() {
    }
    
    public ChitiethdPK(int mahd, String bookId) {
		super();
		this.mahd = mahd;
		this.masp = bookId;
	}
    
	public int getMahd() {
		return this.mahd;
	}
	public void setMahd(int mahd) {
		this.mahd = mahd;
	}
	public String getMasp() {
		return this.masp;
	}
	public void setMasp(String masp) {
		this.masp = masp;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ChitiethdPK)) {
			return false;
		}
		ChitiethdPK castOther = (ChitiethdPK)other;
		return 
			(this.mahd == castOther.mahd)
			&& this.masp.equals(castOther.masp);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.mahd;
		hash = hash * prime + this.masp.hashCode();
		
		return hash;
    }
}