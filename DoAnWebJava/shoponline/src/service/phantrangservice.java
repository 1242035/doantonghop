package service;

import java.util.List;
import java.sql.*;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import model.Sanpham;


import util.jpautil;
import java.sql.*;
public class phantrangservice {
	String value=null;
	String line = null;
	
	PreparedStatement pstatement = null;
	String url = "jdbc:mysql://localhost:3306/";
	String dbName = "dienthoai";
	String driver = "com.mysql.jdbc.Driver";
	String userName = "root"; 
	String password = "";
	
	private EntityManager em;
	public phantrangservice(){
		em=jpautil.getenEntityManager();

	
	}
	
	
}
