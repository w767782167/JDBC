package com.etc._05innerClass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class MyActionListener  implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("我是一个实现了ActionListener的类");
		JOptionPane.showMessageDialog(null, "我是一个实现了ActionListener的类");
	}

}


