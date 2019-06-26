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
	private static JFrame frame1;// 定义为静态变量以便main使用
	private static JFrame frame = new JFrame("电动车上牌系统");
	public void second_swing() {
		// 创建 JFrame 实例
        
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
        JLabel userLabel = new JLabel("欢迎");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(300,10,200,50);
        userLabel.setFont(new Font("Dialog", 1, 25));
        panel.add(userLabel);
        //x,y,w,h
        
        /*
         * 登录界面
         
        JLabel jl = new JLabel("1.查询 2.创建新的数据 3.删除现有数据 4.更改现有数据.5退出");
        jl.setBounds(110, 40, 520, 50);
        jl.setFont(new Font("Dialog", 1, 18));
        panel.add(jl);
        */

        /* 
         * 创建文本域用于用户输入
         
        JTextField userText = new JTextField(20);
        userText.setBounds(200,100,150,25);
        panel.add(userText);

        */
        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("选择需要的操作:");
        passwordLabel.setBounds(10,90,150,40);
        passwordLabel.setFont(new Font("Dialog", 1, 18));
        panel.add(passwordLabel);
        
        
        //按钮选项
        JButton loginButton1 = new JButton("查询");
        loginButton1.setBounds(170, 80, 100, 50);
        
        loginButton1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("1");
				frame.dispose();
			}
		});
        panel.add(loginButton1);
        
        JButton loginButton2 = new JButton("创建");
        loginButton2.setBounds(270, 80, 100, 50);
        
        loginButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("2");
				frame.dispose();
			}
		});
        panel.add(loginButton2);
        
        JButton loginButton3 = new JButton(".删除");
        loginButton3.setBounds(170, 150, 100, 50);
        
        loginButton3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("3");
				frame.dispose();
			}
		});
        panel.add(loginButton3);
        
        JButton loginButton4 = new JButton("更改");
        loginButton4.setBounds(270, 150, 100, 50);
        
        loginButton4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new swing_bean().setOption("4");
				frame.dispose();
			}
		});
        panel.add(loginButton4);
        
        JButton loginButton5 = new JButton("退出");
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
