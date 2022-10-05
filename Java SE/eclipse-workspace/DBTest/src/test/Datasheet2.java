package test;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



public class Datasheet2 {
	public void Data() {
		
	}
	
	public static void main(String[] args) throws SQLException {  
		MariaDBConn db = new MariaDBConn();
		Connection conn = db.getConn();
		PreparedStatement pstmt = null ;
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>(); 
		
		//String sql = "select emp.empno,emp.ename,emp.sal  from emp where deptno=?";    //要执行的SQL
		//pstmt.setInt(1, 1);
		String sql = "select emp.empno,emp.ename,emp.sal  from emp ";    //要执行的SQL
		pstmt = conn.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();//创建数据对象
        
        while (rs.next()){
        	
	    	 Map<String, Object> map = new HashMap<String,Object>();
	         map.put("empno", rs.getInt(1));
	         map.put("ename", rs.getString(2));
	         map.put("sal", rs.getInt(3));
	         list.add(map);
            
        }
        rs.close();
 
        
        Iterator<Map<String, Object>> it = list.iterator();  
        int i = 1;  
        while(it.hasNext()) {  
            Map<String, Object> stuMap = it.next();  
            System.out.print("第" + i + "职工的信息为");  
            System.out.println("职工号:" + stuMap.get("empno") + " ,姓名:" + stuMap.get("ename"));  
            i++;
        } 
        
          
    }  

}
