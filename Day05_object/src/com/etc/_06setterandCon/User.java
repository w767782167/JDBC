package com.etc._06setterandCon;

public class User {
	private String username;
	private int password;
	public User() {
		//super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, int password) {
		super();
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
	
	
	

}
