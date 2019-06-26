package test_for_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import service.swing_bean;
import swing.swing_result;

public class main_test {
	public static void main(String[] args) {
		
		new JTextArea_test().result="qweqweqwqwe";
		new JTextArea_test().frist_swing();
		new JTextArea_test().result="qaaaaaaaaaa";
		JFrame frame = new JTextArea_test().frame;
		new JTextArea_test().jt.append("asdasda");
		frame.setVisible(true);
		
	}

}
