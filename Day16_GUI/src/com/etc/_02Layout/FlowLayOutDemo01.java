package com.etc._02Layout;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 流式布局
 * @author Administrator
 *
 */
public class FlowLayOutDemo01 {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("流式布局");
		frame.setBounds(100, 100, 400, 400);
		
		//设置布局
		frame.setLayout(new FlowLayout());
		for(int i = 0;i<10;i++){
			frame.add(new JButton("我是按钮"+i));
		}
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
