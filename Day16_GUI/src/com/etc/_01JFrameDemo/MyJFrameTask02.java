package com.etc._01JFrameDemo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MyJFrameTask02 {
	//课堂练习：1.做一个带有按钮的窗口2.按钮点击之后弹出一个对话框:”点我，干嘛! “
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("课堂练习");
		frame.setBounds(100, 100, 500, 500);
		
//		设置布局
		frame.setLayout(new FlowLayout());
		
		//添加员工按钮
		JButton button = new JButton("点我按钮");
		button.setBounds(0, 0, 40, 20);
		//添加事件
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//点击的事件
				//System.out.println("点我,干嘛?");
				JOptionPane.showMessageDialog(null, "点我,干嘛?");
				
			}
		});
		frame.add(button);
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
