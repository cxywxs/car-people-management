package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import service.swing_bean;

public class JDBC_Select {
	public static final String URL = "jdbc:mysql://localhost:3306/t1?characterEncoding=utf8&useSSL=false&serverTimezone=UTC&rewriteBatchedStatements=true";
	public static final String USER = "root";
	public static final String PASS = "123123";
	
	public String select(String sql) {
		Connection conn = null;
		Statement stmt = null;
		//String sql = null;
		 String carID = null;
		 String name = null;
		int id=0;
		String a = "";
        String b = "";
		
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");

			 
	            conn = DriverManager.getConnection(URL,USER,PASS);
	            
	            
	            /*
	            if(name!=null&&age!=0) {
	            	sql="SELECT * FROM cxy WHERE name=\""+name+"\" AND age="+age+";";
	            }else if (name!=null) {
					sql="SELECT * FROM cxy WHERE name=\""+name+"\";";
				}else if (age!=0) {
					sql="SELECT * FROM cxy WHERE age="+age+";";
				}else {
					conn.close();
					return "-1";
				}
				*/

	            
	            stmt = conn.createStatement();
	            
	            
	            

	            ResultSet rs = stmt.executeQuery(sql);

	            
	            while(rs.next()){
	                id = rs.getInt("id");
	                carID = rs.getString("carID");
	                name = rs.getString("name");
	                b="id="+id+",carID="+carID+",name="+name;
	                a=a+b+"\n";
	            }
	            rs.close();
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
		
		
		return a;
		
	}
	/*
	public static void main(String[] args) {
		String name = "chen";
		int age = 28;
		JDBC_Select jdbc_Select = new JDBC_Select();
		String aString=  jdbc_Select.select(name, age);
		System.out.println(aString);
	}
	*/
}
