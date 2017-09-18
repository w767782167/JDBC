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
import java.awt.event.MouseListener;

import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteDemo02 {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteDemo02 window = new DeleteDemo02();
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
	public DeleteDemo02() {
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
		
		final JPopupMenu popupMenu = new JPopupMenu();
		//addPopup(table, popupMenu);
		
		JMenuItem menuItem_1 = new JMenuItem("删除");
//		A、	在jtable上添加一个跟鼠标有关的事件
		table.addMouseListener(new MouseAdapter() {
			//适配器模式（Adapter模式）
			public void mouseClicked(MouseEvent e) {//获取单击事件
				
				//JOptionPane.showMessageDialog(null, "鼠标点击");
//				B、	判断鼠标按键：左键、右键
				int button = e.getButton();//1.左键     2.滚轮   3.右键
				System.out.println("button="+button);
				if(button == MouseEvent.BUTTON3){ //右键
//					C、	设置选中行的位置
//					setRowSelectionInterval(int index0, int index1) 
//			          选择从 index0 到 index1 之间（包含两端）的行
					
					table.setRowSelectionInterval(table.rowAtPoint(e.getPoint()), table.rowAtPoint(e.getPoint()));
					
//					D、	在选中的位置，弹出菜单
					popupMenu.show(e.getComponent(), e.getX(), e.getY());
//					E、	获取值
					Object object = table.getValueAt(table.getSelectedRow(), 0);
				    System.out.println(object);
				}
				
				
				
			};
			
			
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
