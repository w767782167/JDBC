package com.etc._02Layout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 边界布局
 * @author Administrator
 *
 */
public class BorderLayoutDemo02 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("边界布局");
		frame.setBounds(100, 100, 400, 400);
		//设置布局
		frame.setLayout(new BorderLayout());
		JButton b1 = new JButton("东");
		frame.add(b1, BorderLayout.EAST);
		
		JButton b2 = new JButton("西");
		frame.add(b2, BorderLayout.WEST);
		
		JButton b3 = new JButton("南");
		frame.add(b3, BorderLayout.SOUTH);
		
	
		JButton b4 = new JButton("北");
		frame.add(b4, BorderLayout.NORTH);
		
		JButton b5 = new JButton("中");
		frame.add(b5, BorderLayout.CENTER);
		
		
		
		
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
