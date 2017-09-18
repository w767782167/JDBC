package com.etc._03Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
				lblNewLabel.setText("欢迎"+TempData.userName+"领导莅临指导");
				
				
				//构造方法
				//lblNewLabel.setText("欢迎"+userName+"领导莅临指导");
			}
		});
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);//居中
		
		//JLabel lblNewLabel = new JLabel("欢迎"+this.userName+"领导莅临指导");
		
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 28));
		lblNewLabel.setBounds(23, 10, 293, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("显示数据");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//使用表视图显示数据
				
				//表里的数据
				Object[][] data = new Object[3][4];
				data[0][0] = "1";
				data[0][1] = "张三";
				data[0][2] = "男";
				data[0][3] = "女";
				
				data[1][0] = "2";
				data[1][1] = "李四";
				data[1][2] = "女";
				data[1][3] = "张三";
				
				data[2][0] = "3";
				data[2][1] = "老王";
				data[2][2] = "男";
				data[2][3] = "张三";
				
	
				//这是列名  表头
				String[] columnNames = {"编号","姓名","性别","爱好"};
				
				//创建TableModel 存放数据
				DefaultTableModel model = new DefaultTableModel(data, columnNames);
				
				//创建表对象
				JTable table = new JTable(model);
				
				
				JScrollPane scroll = new JScrollPane(table);
				scroll.setBounds(50, 50, 400, 400);
				table.setFillsViewportHeight(true);

				frame.getContentPane().add(scroll);
				
				
				
			}
		});
		button.setBounds(326, 23, 93, 23);
		frame.getContentPane().add(button);
	}

}
