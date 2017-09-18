package com.etcxm._01JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCDemo01 {
	public static void main(String[] args) throws Exception {
//		 1.加载注册驱动:
		Class.forName("com.mysql.jdbc.Driver");
			
//		2.使用DriverManager获取连接.
		//127.0.0.1 ==  localhost  == ip地址
//		Connection con = DriverManager.getConnection("" +
//				"jdbc:mysql://127.0.0.1:3306/jdbcdemo?useSSL=false", "root", "123456");
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
		
		System.out.println(con);

	}

}
