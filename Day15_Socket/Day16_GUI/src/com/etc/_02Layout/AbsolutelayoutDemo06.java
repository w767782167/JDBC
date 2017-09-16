package com.etc._02Layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class AbsolutelayoutDemo06 {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbsolutelayoutDemo06 window = new AbsolutelayoutDemo06();
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
	public AbsolutelayoutDemo06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);//绝对布局
		
		textField = new JTextField();
		textField.setBounds(128, 58, 66, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
