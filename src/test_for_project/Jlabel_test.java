package test_for_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Jlabel_test {
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
          * �����ı��������û�����
          */
         String a = "asdawjdawid\nsasa";
         JTextArea userText = new JTextArea(100, 100);
         userText.setBounds(100,40,165,100);
         userText.setText(a);
         userText.setEditable(false);
         panel.add(userText);


         /*
         // ������¼��ť
         JButton loginButton = new JButton("login");
         loginButton.setBounds(180, 100, 80, 25);
         loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(userText.getText().trim().equals("root")) {
					if(new String(passwordText.getPassword()).trim().equals("123456")) {
						JOptionPane.showMessageDialog(frame, "��¼�ɹ�");
						//дһ���رճ��������رճ��򣬹رճ����ܹ�����return�������жϣ�Ȼ���ɿ��Ƴ���رգ�
						System.exit(0);
					}
				}else {
					JOptionPane.showMessageDialog(frame, "��¼ʧ��");
				}
				
			}
		});
		*/
         //panel.add(loginButton);
     }

}
