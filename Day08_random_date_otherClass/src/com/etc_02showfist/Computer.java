package com.etc_02showfist;

import java.util.Random;

public class Computer extends Player {
	
	

	public Computer(String nickName) {
		super(nickName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int showFist() {
		// TODO Auto-generated method stub
		//随机数  1,2,3
		Random r = new Random();
		int k = r.nextInt(3)+1;
		return k;
		
	}

}
