package com.etcxm.ui;

import java.util.Scanner;

import com.etcxm.dao.EmployeeDao;
import com.etcxm.entity.Employee;

public class EmployeeManagerUI {
	private EmployeeDao  dao = new EmployeeDao();
	
	/**
	 * 1.添加界面
	 */
    private void addMenu() {
		while (true) {
			System.out.println("请输入eno,ejob,ename,esex,esalary");
			Scanner sc = new Scanner(System.in);
			int eno = sc.nextInt();
			String ejob = sc.next();
			String ename = sc.next();
			String esex = sc.next();
			double esalary = sc.nextDouble();
			//		创建对象  构造方法
			Employee e = new Employee(eno, ejob, ename, esex.charAt(0), esalary);
			//调用dao添加对象
			dao.addEmployee(e);
			
			System.out.println("是否继续输入:y继续/非y退出输入界面");
			sc = new Scanner(System.in);
			String input = sc.next();
			if(!input.equalsIgnoreCase("y")){
				break;
			}
		}		
	}
    
    /**
     * 2.显示界面
     */
    private void showMenu(){
    	dao.showAllEmployee();
    }
    
    /**
     * 3.删除界面
     */
    
    
    /**
     * 4.修改界面
     */
    
    
    /**
     * 主界面
     */
    public void mainMenu(){
    	while (true) {
			System.out.println("请输入你的选择:1.添加员工 2.删除员工 "
					+ " 3.修改员工 4.显示所有的员工5.退出");
			Scanner input = new Scanner(System.in);
			int ret = input.nextInt();
			switch (ret) {
			case 1:
				addMenu();
				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				showMenu();
				break;
			case 5:
				System.out.println("程序退出");
				System.exit(0);
				break;

			default:
				break;
			}
		}
    }

}
