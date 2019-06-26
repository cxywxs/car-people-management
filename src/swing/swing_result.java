package swing;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
//import javax.swing.JTextField;

//import service.option_choice;
import service.swing_bean;

public class swing_result {
	//private static JFrame frame1;// ����Ϊ��̬�����Ա�mainʹ�� 
	public static JFrame frame = new JFrame("�綯������ϵͳ");// ����Ϊ��̬�����Ա�mainʹ�� 
	public static JTextArea jt = new JTextArea();

	//public static String result_local;
	
	public void frist_swing() {
		

		
		// ���� JFrame ʵ��
        //JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(800, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        frame.setVisible(false);
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
        

        //JTextArea jt = new JTextArea();
        jt.setEditable(false);
        //�˴��������
        //result_local = new swing_bean().getResult();
        jt.setText(new swing_bean().getResult());
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
				new swing_bean().setOption("7");
				//jt.setText(null);
				frame.setVisible(false);
				/*
				while(true) {
					if((new swing_bean().getResult()).equals(jt.getText())) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO �Զ����ɵ� catch ��
							e1.printStackTrace();
						}
					}else {
						jt.setText(new swing_bean().getResult());
						break;
						
					}
				}
				
				*/
			}
		});
        panel.add(loginButton);
    }
	
	public void exit() {
		frame.dispose();
	}

}
