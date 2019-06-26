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
	 private static JFrame frame;// 定义为静态变量以便main使用 
	 public static void main(String[] args) {    
         // 创建 JFrame 实例
         JFrame frame = new JFrame("Login Example");
         // Setting the width and height of frame
         frame.setSize(350, 200);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         /* 创建面板，这个类似于 HTML 的 div 标签
          * 我们可以创建多个面板并在 JFrame 中指定位置
          * 面板中我们可以添加文本字段，按钮及其他组件。
          */
         JPanel panel = new JPanel();    
         // 添加面板
         frame.add(panel);
         /* 
          * 调用用户定义的方法并添加组件到面板
          */
         placeComponents(panel);

         // 设置界面可见
         frame.setVisible(true);
     }

     private static void placeComponents(JPanel panel) {

         /* 布局部分我们这边不多做介绍
          * 这边设置布局为 null
          */
         panel.setLayout(null);

         // 创建 JLabel
         JLabel userLabel = new JLabel("User:");
         /* 这个方法定义了组件的位置。
          * setBounds(x, y, width, height)
          * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
          */
         userLabel.setBounds(10,40,80,25);
         panel.add(userLabel);
         
         
         /*
          * 创建文本域用于用户输入
          */
         String a = "asdawjdawid\nsasa";
         JTextArea userText = new JTextArea(100, 100);
         userText.setBounds(100,40,165,100);
         userText.setText(a);
         userText.setEditable(false);
         panel.add(userText);


         /*
         // 创建登录按钮
         JButton loginButton = new JButton("login");
         loginButton.setBounds(180, 100, 80, 25);
         loginButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(userText.getText().trim().equals("root")) {
					if(new String(passwordText.getPassword()).trim().equals("123456")) {
						JOptionPane.showMessageDialog(frame, "登录成功");
						//写一个关闭程序，启动关闭程序，关闭程序能够发送return，进行判断，然后由控制程序关闭，
						System.exit(0);
					}
				}else {
					JOptionPane.showMessageDialog(frame, "登录失败");
				}
				
			}
		});
		*/
         //panel.add(loginButton);
     }

}
