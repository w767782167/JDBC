package com.etc._02Layout;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 网格布局
 * @author Administrator
 *
 */

public class GridlayoutDemo03 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("网格布局");
		frame.setBounds(100, 100, 400, 400);
		
		//设置布局
		frame.setLayout(new GridLayout(3, 2, 10, 10));
		for(int i=0;i<6;i++){
			frame.add(new JButton("我是按钮"+i));
		}
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
