package com.etc._03Login;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.etc._03Login.dao.UserDao;
import com.etc._03Login.entity.User;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TableTask {

	private JFrame frame;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableTask window = new TableTask();
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
	public TableTask() {
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
		
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(78, 62, 300, 168);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		//创建UserDao 数据库
		UserDao	dao = new UserDao();
		Object[][] data = null;//声明data变量
		try {
			 List<User> list = dao.queryAllUser();
			 data = new Object[list.size()][4];
			 for(int i = 0;i<list.size();i++){
				 User user = list.get(i);
				 data[i][0] = user.getId();
				 data[i][1] = user.getUsername();
				 data[i][2] = user.getBirthday();
				 data[i][3] = user.getHobby();
			 }
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table.setModel(new DefaultTableModel(
				data,
			new String[] {
				"编号", "姓名", "生日", "爱好"
			}
		));
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setBounds(78, 31, 123, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("查询");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=================查询的单击事件
				//获取输入的内容
				String text = textField.getText();
				System.out.println(text);
				//创建UserDao 数据库
				UserDao	dao1 = new UserDao();
				String name = "%"+text+"%";
				Object[][] data = null;//声明data变量
				try {
					List<User> list = dao1.queryUserByLike(name);
					 data = new Object[list.size()][4];
					 for(int i = 0;i<list.size();i++){
						 User user = list.get(i);
						 data[i][0] = user.getId();
						 data[i][1] = user.getUsername();
						 data[i][2] = user.getBirthday();
						 data[i][3] = user.getHobby();
					 }
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				table.setModel(new DefaultTableModel(
						data,
					new String[] {
						"编号", "姓名", "生日", "爱好"
					}
				));
				scrollPane.setViewportView(table);
				
			}
		});
		button.setBounds(230, 30, 93, 23);
		frame.getContentPane().add(button);
	}
}
