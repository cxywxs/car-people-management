package service;

import swing.swing_create;
import swing.swing_delete;
import swing.swing_login;
import swing.swing_result;
import swing.swing_select;
import swing.swing_update;
import swing.swing_welcome;

public class option_choice {
	
	public void choice() {
		
		while(true) {
			if((new swing_bean().getOption()).equals(new swing_bean().getCoption())) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}else {
				//1.查询 2.创建 3.删除 4.更改.5登录6.结果7.选择
				//未补充8.jdbc查询9.jdbc更新
				//option=new swing_bean().getOption();//错误？
				new swing_bean().setCoption(new swing_bean().getOption());
				if((new swing_bean().getOption()).equals("1")) {
					new swing_select().frist_swing();
				}else if((new swing_bean().getOption()).equals("2")) {
					new swing_create().frist_swing();
				}else if((new swing_bean().getOption()).equals("3")) {
					new swing_delete().frist_swing();
				}else if((new swing_bean().getOption()).equals("4")) {
					new swing_update().frist_swing();
				}else if((new swing_bean().getOption()).equals("5")) {
					new swing_login().frist_swing();
				}else if((new swing_bean().getOption()).equals("6")) {
					new swing_result().frist_swing();
				}else if((new swing_bean().getOption()).equals("7")) {
					new swing_welcome().second_swing();
				}else if((new swing_bean().getOption()).equals("8")) {
					new select_test().select();
				}else if((new swing_bean().getOption()).equals("9")) {
					new select_test().create();
				}else if((new swing_bean().getOption()).equals("10")) {
					new select_test().delete();
				}else if((new swing_bean().getOption()).equals("11")) {
					new select_test().update();
				}
				else {
					System.out.println("fialt");
				}
				//break;
			}
		}
		
	}

}
