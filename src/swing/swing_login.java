package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import service.swing_bean;
import test_for_project.data_test;

public class swing_login {
	
	private static JFrame frame1;// ����Ϊ��̬�����Ա�mainʹ�� 
	private static JFrame frame = new JFrame("�綯������ϵͳ");// ����Ϊ��̬�����Ա�mainʹ�� 

	
	public void frist_swing() {

		
		// ���� JFrame ʵ��
        //JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
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
        JLabel userLabel = new JLabel("User:");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        userLabel.setBounds(10,40,80,25);
        panel.add(userLabel);
        
        
        /*
         * ��¼����
         */
        JLabel jl = new JLabel("��¼");
        jl.setBounds(150, 10, 80, 25);
        panel.add(jl);
        

        /* 
         * �����ı��������û�����
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,40,165,25);
        panel.add(userText);

        // ����������ı���
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,70,80,25);
        panel.add(passwordLabel);

        /* 
         *�����������������ı���
         * �����������Ϣ���Ե�Ŵ��棬���ڰ�������İ�ȫ��
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,70,165,25);
        panel.add(passwordText);

        // ������¼��ť
        JButton loginButton = new JButton("login");
        loginButton.setBounds(180, 100, 80, 25);
        loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(userText.getText().trim().equals("user")) {
					if(new String(passwordText.getPassword()).trim().equals("123456")) {
						JOptionPane.showMessageDialog(frame1, "��¼�ɹ�");
						new swing_bean().setOption("7");
						userText.setText(null);
						passwordText.setText(null);
						new swing_login().exit();
						//�������
					}else {
						JOptionPane.showMessageDialog(frame1, "��¼ʧ��");
					}
				}else {
					JOptionPane.showMessageDialog(frame1, "��¼ʧ��");
				}
			}
		});
        panel.add(loginButton);
    }
	
	public void exit() {
		frame.dispose();
	}

}
