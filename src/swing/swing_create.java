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
	private static JFrame frame1;// 定义为静态变量以便main使用 
	private static JFrame frame = new JFrame("电动车上牌系统");// 定义为静态变量以便main使用 

	
	public void frist_swing() {

		
		// 创建 JFrame 实例
        //JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(800, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
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
        JLabel userLabel = new JLabel("车牌:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(150,90,100,50);
        userLabel.setFont(new Font("Dialog", 1, 18));
        panel.add(userLabel);
        
        
        /*
         * 登录界面
         */
        JLabel jl = new JLabel("创建新的车牌信息");
        jl.setBounds(300, 20, 400, 50);
        jl.setFont(new Font("Dialog", 1, 18));
        panel.add(jl);
        
        /*
         * 登录界面
         */
        JLabel jl1 = new JLabel("姓名:");
        jl1.setBounds(150, 60, 100, 50);
        jl1.setFont(new Font("Dialog", 1, 18));
        panel.add(jl1);
        

        /* 
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(250,70,165,25);
        panel.add(userText);
        
        /* 
         * 创建文本域用于用户输入
         */
        JTextField userText1 = new JTextField(20);
        userText1.setBounds(250,100,165,25);
        panel.add(userText1);


        // 创建登录按钮
        JButton loginButton = new JButton("创建");
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
