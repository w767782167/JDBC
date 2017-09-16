package com.etcxm._03test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.etcxm._02Utils.JDBCUtils;
import com.etcxm._04entity.Student;

public class JDBCUtilTest {
	public static void main(String[] args) throws Exception {
		JDBCUtils util = new JDBCUtils();
		util.getConnection();
		
		//插入  t_student
//		String sql = "INSERT INTO t_student (name,age) VALUES (?,?)";
//		ArrayList<Object> params = new ArrayList<Object>();
//		params.add("tom");
//		params.add(21);
//		boolean isOk = util.updateByPreparedStatement(sql, params);
//		if(isOk){
//			System.out.println("插入成功");
//		}else{
//			System.out.println("插入失败");
//		}
		
		
		//查询 1条数据
		
//		String sql = "SELECT * FROM t_student WHERE id = ?";
//		ArrayList<Object> params = new ArrayList<Object>();
//		params.add(7);
//		Student student = util.findSimpleRefResult(sql, params, Student.class);
//		System.out.println(student);
		
		
		//查询 多条数据
		
		String sql = "SELECT * FROM t_student";
//		ArrayList<Object> params = new ArrayList<Object>();
//		params.add(7);
		List<Student> list = util.findMoreRefResult(sql, null, Student.class);
		System.out.println(list);
		
		
		
	}

}
