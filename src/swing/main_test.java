package swing;

import service.option_choice;
import service.select_test;
import service.swing_bean;

public class main_test {

	public static void main(String[] args) {
		/*
		new swing_bean().setName("chen");
		new swing_bean().setCar("sn112");
		new select_test().select();
		System.out.println(new swing_bean().getResult());
		new swing_result().frist_swing(new swing_bean().getResult());
		*/
		swing_result sr = new swing_result();
		sr.frist_swing();
		new swing_bean().setOption("5");
		new option_choice().choice();
	}

}
