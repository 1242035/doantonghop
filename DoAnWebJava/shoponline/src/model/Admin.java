package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the admin database table.
 * 
 */
@Entity
@Table(name="admin")
public class Admin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String useradmin;

	private String pass;

    public Admin() {
    }

	public String getUseradmin() {
		return this.useradmin;
	}

	public void setUseradmin(String useradmin) {
		this.useradmin = useradmin;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}