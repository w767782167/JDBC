package com.etc_04Task;

import java.util.Scanner;

public class User extends Player {
	
	

	public User(String nickName) {
		super(nickName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int showFist() {  //ctrl+1
		// TODO Auto-generated method stub
		System.out.println("请输入 1.石头   2.剪刀 3.布");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		return input;
	}

}
