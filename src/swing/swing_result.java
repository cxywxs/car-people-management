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
	//private static JFrame frame1;// 定义为静态变量以便main使用 
	public static JFrame frame = new JFrame("电动车上牌系统");// 定义为静态变量以便main使用 
	public static JTextArea jt = new JTextArea();

	//public static String result_local;
	
	public void frist_swing() {
		

		
		// 创建 JFrame 实例
        //JFrame frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(800, 400);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
        frame.setVisible(false);
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
        

        //JTextArea jt = new JTextArea();
        jt.setEditable(false);
        //此处给出结果
        //result_local = new swing_bean().getResult();
        jt.setText(new swing_bean().getResult());
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
				new swing_bean().setOption("7");
				//jt.setText(null);
				frame.setVisible(false);
				/*
				while(true) {
					if((new swing_bean().getResult()).equals(jt.getText())) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e1) {
							// TODO 自动生成的 catch 块
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
