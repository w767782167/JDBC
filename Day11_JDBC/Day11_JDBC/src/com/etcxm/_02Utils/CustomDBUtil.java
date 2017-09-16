package com.etcxm._02Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomDBUtil {
	private final String URL = "jdbc:mysql:///jdbcdemo?useSSL=false";
	private final String USERNAME = "root";
	private final String PASSWORD = "123456";
	private final String DRIVER = "com.mysql.jdbc.Driver";
	
	//获取连接对象
	private Connection getconnection(){
		Connection  con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
	
	//DML  ? 
	public boolean updateByPerpard(String sql,Object...objects){
		Connection con = getconnection();
		int result = 0;
		try {
			PreparedStatement prepareStatement = con.prepareStatement(sql);
			for (int i = 0; i < objects.length; i++) {
				prepareStatement.setObject(i+1, objects[i]);
			}
			
			result = prepareStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result>0 ? true:false;
	}
	
	
	//DQL  1条数据
	
	
	//DQL  多条数据
	

}
