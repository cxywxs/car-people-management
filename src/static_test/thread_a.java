package static_test;



public class thread_a extends Thread{
	public static Object  lock;
	 public static int a = 0;
	 public void run() {
		 System.out.println("thread_a start");
		 synchronized(lock) {
			 while(true) {
				 if(a<10) System.out.println(++a+"a");
				 else {
					 try {
						 a=0;
						wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				 }
			 }
		 }
	 }
}
