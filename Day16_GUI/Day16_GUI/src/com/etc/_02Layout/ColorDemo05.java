package com.etc._02Layout;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ColorDemo05 {
	public static void main(String[] args) {
		//创建窗口
				JFrame  frame = new JFrame();
				//设置窗口标题
				frame.setTitle("颜色");
				//设置窗口的位置
				frame.setBounds(100, 100, 200, 200);
				
				//窗口底下有一个容器
				//frame.getContentPane().setBackground(Color.blue);
				//frame.getContentPane().setBackground(Color.BLUE);
				
				//自定义颜色
				//frame.getContentPane().setBackground(new Color(255,0, 0));
				frame.getContentPane().setBackground(new Color(255,0,0,240));
				
				//添加控件  文本
				JLabel lable = new JLabel("你好");
				frame.getContentPane().add(lable);
				
				
				//窗口显示
				frame.setVisible(true);
				//设置关闭的时候,退出进程
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}

}
