package com.etc._04JavaBean;

public class User {
	private String username;
	private int password;
	
	public User() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, int password) {
		//super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	@Override
	public String toString() {
		System.out.println("我是toString方法");
		return "User [username=" + username + ", password=" + password + "]";
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	
	//set/get
	
	
	

}
