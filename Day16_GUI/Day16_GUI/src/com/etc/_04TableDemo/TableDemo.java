package com.etc._04TableDemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TableDemo {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableDemo window = new TableDemo();
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
	public TableDemo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(86, 48, 254, 145);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		//表里的数据  来自数据库
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
		//String[] columnNames = {"编号","姓名","性别","爱好"};
		
		table.setModel(new DefaultTableModel(
				data,//表的内容
			new String[] {
				"编号", "姓名", "性别", "爱好"
			}   //表头
		));
		scrollPane.setViewportView(table);
	}
}
