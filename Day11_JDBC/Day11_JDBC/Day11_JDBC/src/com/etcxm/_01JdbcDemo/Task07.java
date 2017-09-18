package com.etcxm._01JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Task07 {
//	2. 根据学生编号查询特定的某个学生信息，在控制台显示
	public static void queryById(int id) throws Exception{
		String sql = "SELECT * FROM t_student WHERE id=?";
       		
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取  预编译对象
		PreparedStatement prepareStatement = con.prepareStatement(sql);
		prepareStatement.setObject(1, id);
		
		
//		4.执行SQL
		ResultSet set = prepareStatement.executeQuery();
		while(set.next()){
			String name = set.getString("name");
			int age = set.getInt("age");
			long id1 = set.getLong("id");
			System.out.println(age+","+name+","+id1);
			
		}
		
		
//		5.释放资源close()
		prepareStatement.close();
		con.close();
	}
	
//	3. 根据用户输入的姓名进行学生的模糊查询,在控制台显示. '王%' 
	public static void queryByLike(String likename) throws Exception{
		String sql = "SELECT * FROM t_student WHERE name like ?";
       		
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取  预编译对象
		PreparedStatement prepareStatement = con.prepareStatement(sql);
		
		//给 ? 赋值
		prepareStatement.setObject(1, likename);
		
		
//		4.执行SQL
		ResultSet set = prepareStatement.executeQuery();
		while(set.next()){
			String name = set.getString("name");
			int age = set.getInt("age");
			long id1 = set.getLong("id");
			System.out.println(age+","+name+","+id1);
			
		}
		
		
//		5.释放资源close()
		prepareStatement.close();
		con.close();
	}
	

	
	public static void main(String[] args) throws Exception {
		//queryById(5);
		queryByLike("王%");
	}
	

}
