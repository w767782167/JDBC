package com.etc._03Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame {

	public JFrame frame;
	private String userName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}
	
	public MainFrame(String userName) {
		initialize();
		this.userName = userName;
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		final JLabel lblNewLabel = new JLabel("欢迎"+TempData.userName+"领导莅临指导");
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				//第三方临时类
				//lblNewLabel.setText("欢迎"+TempData.userName+"领导莅临指导");
				
				
				//构造方法
				lblNewLabel.setText("欢迎"+userName+"领导莅临指导");
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);//居中
		
		//JLabel lblNewLabel = new JLabel("欢迎"+this.userName+"领导莅临指导");
		
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 28));
		lblNewLabel.setBounds(27, 102, 320, 38);
		frame.getContentPane().add(lblNewLabel);
	}

}
