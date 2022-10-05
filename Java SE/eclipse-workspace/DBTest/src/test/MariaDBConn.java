package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConn {
	//final String DBDRIVER = "org.mariadb.jdbc.Driver";
	//final String DBURL = "jdbc:mariadb://10.7.16.93:3306/test1";
	//final String DBURL = "jdbc:mariadb://127.0.0.1:3306/example";
	final  String DBDRIVER = "com.mysql.jdbc.Driver";
	final String DBURL = "jdbc:mysql://127.0.0.1:3306/example";
	final String DBUSER = "root";
	final String DBPWD = "1234";
	Connection conn = null;

	public MariaDBConn() {
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(DBURL, DBUSER, DBPWD);			
		}catch (ClassNotFoundException | SQLException e){
			//System.out.println("Database getConnection fail!");
			e.printStackTrace();
		}
	}
	public MariaDBConn(String dbUrl, String dbUser, String dbPwd) {
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(dbUrl, dbUrl, dbPwd);
			System.out.println("连接到数据库");
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConn() {
		return conn;
	}
	public void setConn(Connection conn) {
		this.conn = conn;
	}
	public void closeConn(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
