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
	//private static JFrame frame1;// 定义为静态变量以便main使用 
	public static JFrame frame = new JFrame("system");// 定义为静态变量以便main使用 

	public static String result;
	public static JTextArea jt = new JTextArea();
	
	public void frist_swing() {
		

		
		// 创建 JFrame 实例
        //JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(800, 400);
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
        JLabel userLabel = new JLabel("查询结果");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(350,10,100,50);
        userLabel.setFont(new Font("Dialog", 1, 18));
        panel.add(userLabel);
        

        jt.setEditable(false);
        //此处给出结果
        jt.setText(result);
        JScrollPane jsp = new JScrollPane(jt);
        jsp.setBounds(200, 50, 350, 200);
        jsp.setVerticalScrollBarPolicy( JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        panel.add(jsp);
        
        // 创建登录按钮
        JButton loginButton = new JButton("返回");
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
