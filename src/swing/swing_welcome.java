package swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import service.swing_bean;

public class swing_welcome {
	private static JFrame frame1;// ����Ϊ��̬�����Ա�mainʹ��
	private static JFrame frame = new JFrame("�綯������ϵͳ");
	public void second_swing() {
		// ���� JFrame ʵ��
        
        // Setting the width and height of frame
        frame.setSize(800, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* ������壬��������� HTML �� div ��ǩ
         * ���ǿ��Դ��������岢�� JFrame ��ָ��λ��
         * ��������ǿ�������ı��ֶΣ���ť�����������
         */
        JPanel panel = new JPanel();    
        // ������
        frame.add(panel);
        /* 
         * �����û�����ķ����������������
         */
        placeComponents(panel);

        // ���ý���ɼ�
        frame.setVisible(true);
	}
	
	private static void placeComponents(JPanel panel) {
		/* ���ֲ���������߲���������
         * ������ò���Ϊ null
         */
        panel.setLayout(null);

        // ���� JLabel
        JLabel userLabel = new JLabel("��ӭ");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        userLabel.setBounds(300,10,200,50);
        userLabel.setFont(new Font("Dialog", 1, 25));
        panel.add(userLabel);
        //x,y,w,h
        
        /*
         * ��¼����
         
        JLabel jl = new JLabel("1.��ѯ 2.�����µ����� 3.ɾ���������� 4.������������.5�˳�");
        jl.setBounds(110, 40, 520, 50);
        jl.setFont(new Font("Dialog", 1, 18));
        panel.add(jl);
        */

        /* 
         * �����ı��������û�����
         
        JTextField userText = new JTextField(20);
        userText.setBounds(200,100,150,25);
        panel.add(userText);

        */
        // ����������ı���
        JLabel passwordLabel = new JLabel("ѡ����Ҫ�Ĳ���:");
        passwordLabel.setBounds(10,90,150,40);
        passwordLabel.setFont(new Font("Dialog", 1, 18));
        panel.add(passwordLabel);
        
        
        //��ťѡ��
        JButton loginButton1 = new JButton("��ѯ");
        loginButton1.setBounds(170, 80, 100, 50);
        
        loginButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("1");
				frame.dispose();
			}
		});
        panel.add(loginButton1);
        
        JButton loginButton2 = new JButton("����");
        loginButton2.setBounds(270, 80, 100, 50);
        
        loginButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("2");
				frame.dispose();
			}
		});
        panel.add(loginButton2);
        
        JButton loginButton3 = new JButton(".ɾ��");
        loginButton3.setBounds(170, 150, 100, 50);
        
        loginButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("3");
				frame.dispose();
			}
		});
        panel.add(loginButton3);
        
        JButton loginButton4 = new JButton("����");
        loginButton4.setBounds(270, 150, 100, 50);
        
        loginButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("4");
				frame.dispose();
			}
		});
        panel.add(loginButton4);
        
        JButton loginButton5 = new JButton("�˳�");
        loginButton5.setBounds(370, 150, 100, 50);
        
        loginButton5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("5");
				frame.dispose();
			}
		});
        panel.add(loginButton5);


        
    }
	
	public void exit() {
		frame.dispose();
	}
	

}
