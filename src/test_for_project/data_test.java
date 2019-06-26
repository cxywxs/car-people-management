package test_for_project;

import swing.swing_login;
import swing.swing_welcome;

public class data_test {
	
	private static int a = 0;
	
	public void set(int a) {
		data_test.a = a;
	}
	
	public int get() {
		return data_test.a;
		
	}
	
	public void do_some() {
		if(a==1) {
			swing_welcome sw = new swing_welcome();
			sw.second_swing();
		}
	}
	
	public static void main(String[] args) {
		swing_login sl = new swing_login();
		sl.frist_swing();
		data_test dt = new data_test();
		int a = 0;
		int b = 0;
		boolean c = true;
		System.out.println("aa");
		while(c) {
			a = data_test.a;
			if(a!=b) {
				dt.do_some();
				b=a;
				c=false;
			}
		}
		System.out.println("asdasdasd");
	}

}
