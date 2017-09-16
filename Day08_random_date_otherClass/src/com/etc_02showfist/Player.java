package com.etc_02showfist;

public abstract class Player {
	private String nickName;
	private int score;
	
	
	
	public Player(String nickName) {
		super();
		this.nickName = nickName;
	}



	public String getNickName() {
		return nickName;
	}



	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	//出拳的抽象方法
	public abstract int showFist();
}
