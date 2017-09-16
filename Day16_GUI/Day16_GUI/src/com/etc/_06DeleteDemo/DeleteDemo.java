package com.etc._06DeleteDemo;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.etc._03Login.dao.UserDao;
import com.etc._03Login.entity.User;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteDemo {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteDemo window = new DeleteDemo();
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
	public DeleteDemo() {
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
		scrollPane.setBounds(70, 54, 297, 145);
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
						 data[i][2] = user.getSex();
						 data[i][3] = user.getHobby();
					 }
					 
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		table.setModel(new DefaultTableModel(
			data,
			new String[] {
				"编号", "姓名", "性别", "爱好"
			}
		));
		scrollPane.setViewportView(table);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);
		
		JMenuItem menuItem_1 = new JMenuItem("删除");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// --------------删除的事件
				System.out.println("删除");
				int n = JOptionPane.showConfirmDialog(null, "是否删除", "提示",
						JOptionPane.YES_NO_OPTION);
				System.out.println("n = " + n);

				if (n == 0) {// 确认删除
				// getValueAt(int row, int column)
				// 返回 row 和 column 位置的单元格值。

					Object obj = table.getValueAt(table.getSelectedRow(), 0);
					System.out.println(obj);

					// 创建UserDao 数据库
					UserDao dao = new UserDao();
					try {
						boolean flag = dao.deleteUser((Long) obj);
						if (flag) {
							JOptionPane.showMessageDialog(null, "删除成功");

							//---------数据库   table刷新数据开始--------------
							// 创建UserDao 数据库
							Object[][] data = null;// 声明data变量
							try {
								List<User> list = dao.queryAllUser();
								data = new Object[list.size()][4];
								for (int i = 0; i < list.size(); i++) {
									User user = list.get(i);
									data[i][0] = user.getId();
									data[i][1] = user.getUsername();
									data[i][2] = user.getSex();
									data[i][3] = user.getHobby();
								}

							} catch (Exception e2) {
								// TODO Auto-generated catch block
								e2.printStackTrace();
							}
							table.setModel(new DefaultTableModel(data,
						new String[] { "编号", "姓名", "性别", "爱好" }));
							
							//---------数据库   table刷新数据结束--------------
						} else {
							JOptionPane.showMessageDialog(null, "删除失败");
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}

		});
		popupMenu.add(menuItem_1);
		
		JMenu menu = new JMenu("点我");
		popupMenu.add(menu);
		
		JMenuItem menuItem = new JMenuItem("我是子菜单");
		menu.add(menuItem);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
