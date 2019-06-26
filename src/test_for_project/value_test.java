package test_for_project;

public class value_test {

	public static int a;
	public static String b = null;
	
	public void send() {
		System.out.println("a="+a+",b="+b);
		
	}
	
	public void change(int c,String d) {
		a=c;
		b=d;
	}

}
