package service;

public class swing_bean {
	private static String name=null;
	private static String carID=null;
	private static String Cname=null;
	private static String CcarID=null;
	private static String result=null;
	private static String option="0";
	private static String Coption="0";
	
	public void setName(String name) {
		swing_bean.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCar(String carID) {
		swing_bean.carID = carID;
	}
	
	public String getCar() {
		return carID;
	}
	
	public void setCname(String Cname) {
		swing_bean.Cname = Cname;
	}
	
	public String getCname() {
		return Cname;
	}
	
	public void setCcar(String CcarID) {
		swing_bean.CcarID = CcarID;
	}
	
	public String getCcar() {
		return CcarID;
	}
	
	public void setResult(String result) {
		swing_bean.result = result;
	}
	
	public String getResult() {
		return result;
	}
	
	public void setOption(String option) {
		swing_bean.option = option;
	}
	
	public String getOption() {
		return option;
	}
	
	public void setCoption(String Coption) {
		swing_bean.Coption = Coption;
	}
	
	public String getCoption() {
		return Coption;
	}

}
