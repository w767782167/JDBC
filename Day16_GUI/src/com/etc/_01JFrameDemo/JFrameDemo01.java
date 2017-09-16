package com.etc._01JFrameDemo;



import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameDemo01 {
	public static void main(String[] args) {
		//创建窗口
		JFrame  frame = new JFrame();
		//设置窗口标题
		frame.setTitle("Hello World");
		//设置窗口的位置
		frame.setBounds(100, 100, 200, 200);
		
		
		//添加控件  文本
		JLabel lable = new JLabel("你好");
		frame.add(lable);
		
		
		//窗口显示
		frame.setVisible(true);
		//设置关闭的时候,退出进程
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
