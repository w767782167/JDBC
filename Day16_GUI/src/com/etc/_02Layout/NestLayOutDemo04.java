package com.etc._02Layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 嵌套布局
 * @author Administrator
 *
 */

public class NestLayOutDemo04 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("嵌套布局");
		frame.setBounds(100, 100, 400, 400);
		//设置布局   1.大边界布局
		frame.setLayout(new BorderLayout());
		
		JPanel westPanel = new JPanel(); 
		westPanel.setBackground(Color.GREEN);//设置颜色
		frame.add(westPanel,BorderLayout.WEST);
		westPanel.setPreferredSize(new Dimension(60, 60));//设置大小
		
		JPanel southPanel = new JPanel();
		southPanel.setBackground(Color.BLACK);
		frame.add(southPanel,BorderLayout.SOUTH);
		southPanel.setPreferredSize(new Dimension(60, 60));
		
		JPanel centerPanel = new JPanel(); 
		centerPanel.setBackground(Color.ORANGE);
		frame.add(centerPanel,BorderLayout.CENTER);
		
		centerPanel.setLayout(new BorderLayout());//2..中间看成边界布局
		
		JButton btn = new JButton("我在中间的北方");
		centerPanel.add(btn, BorderLayout.NORTH);
		
		JPanel center_centerPanel = new JPanel();
		centerPanel.add(center_centerPanel, BorderLayout.CENTER);
		center_centerPanel.setBackground(Color.BLUE);
		
		center_centerPanel.setLayout(new FlowLayout());//3.中间的中间流式布局
		
		for(int i = 0;i<6;i++){
			center_centerPanel.add(new JButton("我是按钮"+i));
		}
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
