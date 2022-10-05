package com.shelley.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils {
	private static String url = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
	private static String user = "root";// username
	private static String password = "7035786126";
	
	private static 
	
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//1.��ȡ���Ӷ���
	public static Connection getConnection() throws SQLException{
		
		return DriverManager.getConnection(url, user, password);
	}
	//2.�ͷ���Դ
	public static void close(Connection conn,PreparedStatement pst,ResultSet rs){
		
		try {
			if (rs != null)
				rs.close();
			if (pst != null)
				pst.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
