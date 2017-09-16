package com.etc._03Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame {

	private JFrame frame;
	private JTextField userNametextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame window = new LoginFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);//窗口不能拉伸
		
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);//居中
		
		JLabel userNamelabel = new JLabel("用户名");
		userNamelabel.setFont(new Font("宋体", Font.PLAIN, 14));
		userNamelabel.setBounds(58, 53, 54, 15);
		frame.getContentPane().add(userNamelabel);
		
		JLabel passWordlabel = new JLabel("密码");
		passWordlabel.setFont(new Font("宋体", Font.PLAIN, 14));
		passWordlabel.setBounds(58, 93, 54, 15);
		frame.getContentPane().add(passWordlabel);
		
		userNametextField = new JTextField();
		userNametextField.setBounds(122, 46, 156, 29);
		frame.getContentPane().add(userNametextField);
		userNametextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 86, 156, 29);
		frame.getContentPane().add(passwordField);
		
		JButton LoginBtn = new JButton("登录");
		LoginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//---------登录的事件
				//1.获取用户名和密码
				String userName = userNametextField.getText();
				char[] pw = passwordField.getPassword();
				String passWord = String.valueOf(pw);
				System.out.println(userName +"======"+passWord);
				//2.判断是否为空
				if(StringUtil.hasLength(userName) && 
						StringUtil.hasLength(passWord)){
					//3.用户名和密码是否正确   用户名:admin 密码:123456
					if(userName.equals("admin") && passWord.equals("123456")){
						//JOptionPane.showMessageDialog(null, "登录成功");
						
//						4.跳转到主界面
//						方法1:构造方法
						MainFrame window = new MainFrame(userName);
						window.frame.setVisible(true);
						
						//方法2:使用第三方临时类
						
//						MainFrame window = new MainFrame();
//						TempData.userName = userName;
//						window.frame.setVisible(true);
						
						//隐藏登录界面
						frame.setVisible(false);
					}else{
						JOptionPane.showMessageDialog(null, "用户名或密码错误");
					}
					
				}else{
					JOptionPane.showMessageDialog(null, "输入不能为空");
				}
			}
		});
		LoginBtn.setBounds(99, 164, 150, 35);
		frame.getContentPane().add(LoginBtn);
	}
}
