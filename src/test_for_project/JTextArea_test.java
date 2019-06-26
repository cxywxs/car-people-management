package test_for_project;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import service.swing_bean;
import swing.swing_result;

public class JTextArea_test {
	//private static JFrame frame1;// ����Ϊ��̬�����Ա�mainʹ�� 
	public static JFrame frame = new JFrame("system");// ����Ϊ��̬�����Ա�mainʹ�� 

	public static String result;
	public static JTextArea jt = new JTextArea();
	
	public void frist_swing() {
		

		
		// ���� JFrame ʵ��
        //JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(800, 400);
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
        JLabel userLabel = new JLabel("��ѯ���");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        userLabel.setBounds(350,10,100,50);
        userLabel.setFont(new Font("Dialog", 1, 18));
        panel.add(userLabel);
        

        jt.setEditable(false);
        //�˴��������
        jt.setText(result);
        JScrollPane jsp = new JScrollPane(jt);
        jsp.setBounds(200, 50, 350, 200);
        jsp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(jsp);
        
        // ������¼��ť
        JButton loginButton = new JButton("����");
        loginButton.setBounds(350, 270, 100, 50);
        loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
        panel.add(loginButton);
    }
	
	public void exit() {
		frame.dispose();
	}
	
	public void values_change() {
		result = "sdasdasdas";
		
	}
	
	

}
