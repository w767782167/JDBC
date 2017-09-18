package com.etcxm._01JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLDemo02 {
	public static void main(String[] args) throws Exception {
		String sql = "CREATE TABLE `t_student`(`id` " +
				"BIGINT PRIMARY KEY AUTO_INCREMENT," +
				" `name` VARCHAR(255), `age` INT)";
		
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取语句对象
		Statement statement = con.createStatement();
		
//		4.执行SQL
		statement.executeUpdate(sql);
		
//		5.释放资源close()
		statement.close();
		con.close();
		

	}

}
