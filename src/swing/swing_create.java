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


public class swing_create {
	private static JFrame frame1;// ����Ϊ��̬�����Ա�mainʹ�� 
	private static JFrame frame = new JFrame("�綯������ϵͳ");// ����Ϊ��̬�����Ա�mainʹ�� 

	
	public void frist_swing() {

		
		// ���� JFrame ʵ��
        //JFrame frame = new JFrame("Login Example");
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
        JLabel userLabel = new JLabel("����:");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        userLabel.setBounds(150,90,100,50);
        userLabel.setFont(new Font("Dialog", 1, 18));
        panel.add(userLabel);
        
        
        /*
         * ��¼����
         */
        JLabel jl = new JLabel("�����µĳ�����Ϣ");
        jl.setBounds(300, 20, 400, 50);
        jl.setFont(new Font("Dialog", 1, 18));
        panel.add(jl);
        
        /*
         * ��¼����
         */
        JLabel jl1 = new JLabel("����:");
        jl1.setBounds(150, 60, 100, 50);
        jl1.setFont(new Font("Dialog", 1, 18));
        panel.add(jl1);
        

        /* 
         * �����ı��������û�����
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(250,70,165,25);
        panel.add(userText);
        
        /* 
         * �����ı��������û�����
         */
        JTextField userText1 = new JTextField(20);
        userText1.setBounds(250,100,165,25);
        panel.add(userText1);


        // ������¼��ť
        JButton loginButton = new JButton("����");
        loginButton.setBounds(450, 70, 100, 50);
        loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setName(userText.getText());
				new swing_bean().setCar(userText1.getText());
				userText.setText(null);
				userText1.setText(null);
				new swing_bean().setOption("9");
				new swing_create().exit();
			}
		});
        panel.add(loginButton);
    }
	
	public void exit() {
		frame.dispose();
	}

	
}
