package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_update {
	public static final String URL = "jdbc:mysql://localhost:3306/t1?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	public static final String USER = "root";
	public static final String PASS = "123123";
	
	public void select(String sql) {
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");

			 
	            conn = DriverManager.getConnection(URL,USER,PASS);
	            
	            stmt = conn.createStatement();
	            
	            
	            

	            stmt.executeUpdate(sql);
	            stmt.close();
	            conn.close();
		} catch(SQLException se){
	           // JDBC 操作错误
	           se.printStackTrace();
	       }catch(Exception e){
	           // Class.forName 错误
	           e.printStackTrace();
	       }finally{
	           //这里一般用来关闭资源的
	           try{
	               if(stmt!=null)
	                   stmt.close();
	           }catch(SQLException se2){
	           }
	           try{
	               if(conn!=null)
	                   conn.close();
	           }catch(SQLException se){
	               se.printStackTrace();
	           }
	       }
		
		
	}
	/*
	public static void main(String[] args) {
		String sql = "insert into cxy (name,age) values(\"se\",31);";
		JDBC_update update = new JDBC_update();
		update.select(sql);
	}
	*/

}
