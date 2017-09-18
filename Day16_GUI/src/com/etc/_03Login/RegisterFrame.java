package com.etc._03Login;
/**
 * 注册界面
 */

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

import com.etc._03Login.dao.UserDao;
import com.etc._03Login.entity.User;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterFrame {

	public JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterFrame window = new RegisterFrame();
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
	public RegisterFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		frame.setLocationRelativeTo(null);//居中
		
		textField = new JTextField();
		textField.setBounds(113, 41, 164, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(115, 83, 162, 32);
		frame.getContentPane().add(passwordField);
		
		JRadioButton rdoMale = new JRadioButton("男");
		buttonGroup.add(rdoMale);
		rdoMale.setSelected(true);
		rdoMale.setBounds(120, 141, 53, 23);
		frame.getContentPane().add(rdoMale);
		
		final JRadioButton rdoFemale = new JRadioButton("女");
		buttonGroup.add(rdoFemale);
		rdoFemale.setBounds(192, 141, 46, 23);
		frame.getContentPane().add(rdoFemale);
		
		final JComboBox cmbYear = new JComboBox();
		cmbYear.setModel(new DefaultComboBoxModel(new String[] {"1994", "1995", "1996", "1997", "1998", "1999", "2000"}));
		cmbYear.setBounds(106, 173, 67, 21);
		frame.getContentPane().add(cmbYear);
		
		final JComboBox cmbMonth = new JComboBox();
		cmbMonth.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cmbMonth.setBounds(186, 173, 52, 21);
		frame.getContentPane().add(cmbMonth);
		
		final JComboBox cmbDay = new JComboBox();
		cmbDay.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"}));
		cmbDay.setBounds(245, 173, 53, 21);
		frame.getContentPane().add(cmbDay);
		
		JLabel label = new JLabel("性别:");
		label.setBounds(38, 145, 54, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("生日:");
		label_1.setBounds(38, 176, 36, 15);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("爱好:");
		lblNewLabel.setBounds(38, 225, 54, 15);
		frame.getContentPane().add(lblNewLabel);
		
		final JCheckBox cBxHobby1 = new JCheckBox("足球");
		cBxHobby1.setBounds(85, 221, 61, 23);
		frame.getContentPane().add(cBxHobby1);
		
		final JCheckBox cBxHobby2 = new JCheckBox("游戏");
		cBxHobby2.setBounds(149, 221, 53, 23);
		frame.getContentPane().add(cBxHobby2);
		
		final JCheckBox cBxHobby3 = new JCheckBox("阅读");
		cBxHobby3.setBounds(219, 221, 53, 23);
		frame.getContentPane().add(cBxHobby3);
		
		JButton button = new JButton("注册");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//注册按钮的单击事件
				
				//---------获取用户输入的信息
				//1用户名:
				String username = textField.getText();
				
				//2密码:
				char[] pw = passwordField.getPassword();
				String password = String.valueOf(pw);
				
				//3.性别:
				String sex = "男";
				if(rdoFemale.isSelected()){
					sex = "女";
				}
				
				
				//4生日:
				String year = cmbYear.getSelectedItem()+"";
				String month = cmbMonth.getSelectedItem()+"";
				String day = cmbDay.getSelectedItem()+"";
				
				String birthDay = year+"-"+month+"-"+day;
				
				//string--->date
				
				//5爱好:
				String hobby = "";
				if(cBxHobby1.isSelected()){
					hobby += cBxHobby1.getText()+",";
				}
				if(cBxHobby2.isSelected()){
					hobby += cBxHobby2.getText()+",";
				}
				if(cBxHobby3.isSelected()){
					hobby += cBxHobby3.getText();
				}
				
				System.out.println(username);
				System.out.println(password);
				System.out.println(sex);
				System.out.println(birthDay);
				System.out.println(hobby);
				
				//GUI+JDBC(entity  utils  dao  界面层)
				//使用数据库保存数据
				UserDao dao = new UserDao();
				User u = new User(0,username,password,sex,birthDay,hobby);
				try {
					boolean flag = dao.addUser(u);
					if(flag){
						JOptionPane.showMessageDialog(null, "注册成功");
						//注册界面 跳转到登录界面
						LoginFrame window = new LoginFrame();
						window.frame.setVisible(true);
						
						//关闭注册界面
						frame.dispose();
						
					}else{
						JOptionPane.showMessageDialog(null, "注册失败");
					}
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		button.setBounds(113, 279, 159, 39);
		frame.getContentPane().add(button);
	}
}
