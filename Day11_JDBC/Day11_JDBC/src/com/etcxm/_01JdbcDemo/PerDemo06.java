package com.etcxm._01JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PerDemo06 {
//	需求:把t_student表id为2的数据姓名改为西门官人 , 年龄 32
	//id = ?   name =?  age  = ?
	public static void update() throws Exception{
		
		String sql = "UPDATE t_student SET name = ?,age = ? WHERE id = ?";
        System.out.println(sql);		
//		1.加载注册驱动
		Class.forName("com.mysql.jdbc.Driver");
//		2.获取连接对象
		Connection con = DriverManager.getConnection("" +
				"jdbc:mysql:///jdbcdemo?useSSL=false", "root", "123456");
//		3.获取  预编译对象
		PreparedStatement prepareStatement = con.prepareStatement(sql);
		prepareStatement.setObject(1,"西门官人");
		prepareStatement.setObject(2, 40);
		prepareStatement.setObject(3, 1);
		
		
//		4.执行SQL
		int res = prepareStatement.executeUpdate();
		System.out.println(res); //行数
		
//		5.释放资源close()
		prepareStatement.close();
		con.close();
	}
	public static void main(String[] args) throws Exception {
		update();
	}

}
