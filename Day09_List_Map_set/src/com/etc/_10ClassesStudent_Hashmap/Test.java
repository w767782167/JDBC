package com.etc._10ClassesStudent_Hashmap;

public class Test {
	public static void main(String[] args) {
		Classes c = new Classes();
		
		Student s1 = new Student("jack","1");
		Student s2 = new Student("jook","2");
		Student s3 = new Student("will","3");
		
		//调用添加的方法
		c.add(s1);
		c.add(s2);
		c.add(s3);
		
		System.out.println("----------------");
		
		//调用查询全部的方法
		c.showAllStudents();
		
		
		
		System.out.println("----------------");
		
		//根据name来查询学生
		Student student = c.queryStudent("jack");
		if(student == null){
			System.out.println("该学生不存在");
		}else{
			System.out.println("找到"+student);
		}
		
		System.out.println("----------------");
		//删除学生
		boolean isOk = c.deleteStudent("1");
		if(isOk){
			System.out.println("删除成功");
		}else{
			System.out.println("删除失败");
		}
		System.out.println("----------------");
		c.showAllStudents();
		
	}

}
