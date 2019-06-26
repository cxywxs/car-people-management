package service;


import org.omg.CosNaming.NameComponent;

import jdbc.JDBC_Select;
import jdbc.JDBC_update;
import swing.swing_result;

public class select_test {
	swing_result sr = new swing_result();
	public void select() {
		String sql = null;
		String a = null;
		String name = new swing_bean().getName();
		String carID = new swing_bean().getCar();
		if(name.isEmpty()||carID.isEmpty()) {
			sql = "SELECT * FROM cxy1;";
			
		}else {
			sql = "SELECT * FROM cxy1 WHERE name=\""+name+"\" AND carID=\""+carID+"\";";
			
		}
		
		//SELECT * FROM cxy1 WHERE name=chen AND carID=sn112;
		//String sql = "SELECT * FROM cxy1 WHERE name=\""+name+"\" AND carID=\""+carID+"\";";
		String result = new JDBC_Select().select(sql);
		//new swing_bean().setResult(result);
		swing_result.jt.append(result+"\n");
		swing_result.frame.setVisible(true);
	}
	
	public void create() {
		String name = new swing_bean().getName();
		String carID = new swing_bean().getCar();
		String sql = "insert into cxy1 (name,carID) values(\""+ name+"\",\""+carID+"\");";
		new JDBC_update().select(sql);

		sql= "SELECT * FROM cxy1 WHERE name=\""+name+"\" AND carID=\""+carID+"\";";
		String result = new JDBC_Select().select(sql);
		//new swing_bean().setResult(result+"\n添加成功");
		swing_result.jt.append(result+"添加成功\n");
		swing_result.frame.setVisible(true);
	}
	
	public void delete() {
		String name = new swing_bean().getName();
		String carID = new swing_bean().getCar();
		String sql = "DELETE FROM cxy1 WHERE name=\""+name+"\" AND carID=\""+carID+"\";";
		new JDBC_update().select(sql);
		sql = "SELECT * FROM cxy1 WHERE name=\""+name+"\" AND carID=\""+carID+"\";";
		String result = new JDBC_Select().select(sql);
		/*
		if(result.substring(3, 4).equals("0")) {
			swing_result.jt.append("删除成功\n");
		}else {
			swing_result.jt.append("删除失败\n");
		}
		*/
		swing_result.jt.append("删除成功\n");
		swing_result.frame.setVisible(true);
	}
	
	public void update() {
		String name = new swing_bean().getName();
		String carID = new swing_bean().getCar();
		String Cname = new swing_bean().getCname();
		String CcarID = new swing_bean().getCcar();
		//UPDATE runoob_tbl SET runoob_title='学习 C++' WHERE runoob_id=3;
		String sql = "UPDATE cxy1 SET name =\""+Cname+"\" , carID=\""+CcarID+"\" WHERE name=\""+name+"\" AND carID=\""+carID+"\";";
		new JDBC_update().select(sql);
		sql = "SELECT * FROM cxy1 WHERE name=\""+Cname+"\" AND carID=\""+CcarID+"\";";
		String result = new JDBC_Select().select(sql);
		swing_result.jt.append(result+"修改成功\n");
		swing_result.frame.setVisible(true);
	}

}
