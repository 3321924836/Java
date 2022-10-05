package test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Datasheet3 {
	public void Data() {
		
	}
	
	public static void main(String[] args) throws SQLException {  
		MariaDBConn db = new MariaDBConn();
		Connection conn = db.getConn();
		PreparedStatement ps = null ;
        
		try {
			String sql = "update emp set sal=? where empno=?";
 
	        ps = conn.prepareStatement(sql);  
       
            ps.setObject(1,34341);  
  
            ps.setObject(2,2); 
           
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// ÊÍ·Å×ÊÔ´
			ps.close();
			conn.close();
		}
        
          
    }  

}
