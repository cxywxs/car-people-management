package test_for_project;


public class thread_test_extends extends Thread{
	

	
	public void run() {
		int i = 0;
		System.out.println("i=0");
		while(true) {
			System.out.println(i++);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	

}
