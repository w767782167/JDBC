package com.etcxm._01JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DMLDemo03 {
//	需求:往t_student表中插入一条数据 -->东方姑娘, 18
	public static void insert() throws Exception{
		String sql = "INSERT INTO t_student (name,age) VALUES ('东方姑娘',18)";
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取语句对象
		Statement statement = con.createStatement();
		
//		4.执行SQL
		int res = statement.executeUpdate(sql);
		System.out.println(res); //行数
		
//		5.释放资源close()
		statement.close();
		con.close();
	}
	
//	需求:把t_student表id为2的数据姓名改为西门官人 , 年龄 32
	public static void update() throws Exception{
		String sql = "UPDATE t_student SET name = '西门官人 ',age = 32 WHERE id = 2";
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取语句对象
		Statement statement = con.createStatement();
		
//		4.执行SQL
		int res = statement.executeUpdate(sql);
		System.out.println(res); //行数
		
//		5.释放资源close()
		statement.close();
		con.close();
	}
	
	
//	需求:把t_student表id为2的记录删除
	public static void delete() throws Exception{
		String sql = "DELETE FROM t_student WHERE id = 2";
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取语句对象
		Statement statement = con.createStatement();
		
//		4.执行SQL
		int res = statement.executeUpdate(sql);
		System.out.println(res); //行数
		
//		5.释放资源close()
		statement.close();
		con.close();
	}
	

	
	
	public static void main(String[] args) throws Exception {
		//insert();
		
		//update();
		
		delete();
	}

}
