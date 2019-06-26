package test_for_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import static_test.data_test;

public class ActionListener_test {
		
	 private static JFrame frame;// ����Ϊ��̬�����Ա�mainʹ�� 
	
	 public static void main(String[] args) {    
         // ���� JFrame ʵ��
         JFrame frame = new JFrame("Login Example");
         // Setting the width and height of frame
         frame.setSize(350, 200);
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
				if(userText.getText().trim().equals("root")) {
					if(new String(passwordText.getPassword()).trim().equals("123456")) {
						JOptionPane.showMessageDialog(frame, "��¼�ɹ�");
						//дһ���رճ��������رճ��򣬹رճ����ܹ�����return�������жϣ�Ȼ���ɿ��Ƴ���ر�
						data_test d = new data_test();	
						d.set_a("caishi");
					}
				}else {
					JOptionPane.showMessageDialog(frame, "��¼ʧ��");
				}
				
			}
		});
         panel.add(loginButton);
     }
	
}
