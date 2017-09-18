package com.etcxm.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.etcxm._02Utils.JDBCUtils;
import com.etcxm.entity.Employee;

/**
 * 操作员工的类
 * @author Administrator
 *
 */
public class EmployeeDao {
	//创建一个JDBC
	private JDBCUtils util = new JDBCUtils();
	public EmployeeDao(){
		util.getConnection();
	}
	
	//1.添加
	public void addEmployee(Employee employee) throws Exception{
		if(employee == null){
			System.out.println("employee不能为空");
			return;
		}
		
		if(queryEmployee(employee.getEno())!=null){
			System.out.println("员工已经存在了,不能添加");
		}else{
			String sql = "INSERT INTO t_employee (ejob,ename,esex,eSalary) " +
					"VALUES(?,?,?,?)";
			ArrayList<Object> params = new ArrayList<Object>();
			params.add(employee.getEjob());
			params.add(employee.getEname());
			params.add(employee.getEsex());
			params.add(employee.geteSalary());
			boolean isOk = util.updateByPreparedStatement(sql, params);
			util.releaseConn();
			if(isOk){
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}
		}
	}
		
	//2.删除
	public boolean deleteEmployee(int eno) throws Exception{
		if(queryEmployee(eno)==null){
			System.out.println("员工不存在了,不能删除");
			return false;
		}else{
			String sql = "DELETE FROM t_employee WHERE eno = ?";
			ArrayList<Object> params = new ArrayList<Object>();
			params.add(eno);
			boolean isOk = util.updateByPreparedStatement(sql, params);
			util.releaseConn();
			return isOk;
		}
		
	}
	
	//3.修改
	public void updateEmployee(Employee employee) throws Exception{
		if(queryEmployee(employee.getEno())==null){
			System.out.println("员工不存在了,不能修改");
		}else{
			String sql = "UPDATE t_employee SET ejob=?,ename=?,esex=?,eSalary=? " +
					"WHERE eno = ?";
			ArrayList<Object> params = new ArrayList<Object>();
			params.add(employee.getEjob());
			params.add(employee.getEname());
			params.add(employee.getEsex());
			params.add(employee.geteSalary());
			
			params.add(employee.getEno());
			
			boolean isOk = util.updateByPreparedStatement(sql, params);
			util.releaseConn();
			if(isOk){
				System.out.println("修改成功");
			}else{
				System.out.println("修改失败");
			}
		}
		
	}
	
	
	
//	4.查找  多个人
	public void showAllEmployee() throws Exception{
		String sql = "SELECT * FROM t_employee";
		List<Employee> list = util.findMoreRefResult(sql, null, Employee.class);
		System.out.println(list);
		util.releaseConn();
		
	}
	
	//5.查找  1个人
	public Employee queryEmployee(int eno) throws Exception {
		String sql = "SELECT * FROM t_employee WHERE eno = ?";
		ArrayList<Object> params = new ArrayList<Object>();
		params.add(eno);
		Employee employee = util.findSimpleRefResult(sql, params, Employee.class);
		util.releaseConn();
		return employee;
		
	}

}
