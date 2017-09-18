package com.etc._05innerClass;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class InnerDemo {

	private JFrame frame;
	String str ="www";
	
	//内部类
	class T implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "我是一个内部类,叫T");
		}
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InnerDemo window = new InnerDemo();
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
	public InnerDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//方法内部类
		class TT implements ActionListener {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "我是一个方法内部类,叫TT");
			}
		}
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		 
		
		JButton button = new JButton("我是按钮");
		//单击事件 
		//1.外部类 
		//button.addActionListener(new MyActionListener());
		
		//2.匿名内部类
		//匿名内部类 可以访问 1.final 常量  2.全局变量
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "我是一个匿名内部类");
				System.out.println(str);
			}
		});
		
		//3.内部类
		//button.addActionListener(new T());
		
		//4.方法内部类
		//button.addActionListener(new TT());
		
		button.setBounds(150, 105, 93, 23);
		frame.getContentPane().add(button);
	}

}
