package com.etc._03ClassesStudent_ArrayList;

import java.util.ArrayList;

/**
 * 班级类
 * @author Administrator
 *
 */
public class Classes {
	//集合中,只能存放引用(对象)类型,不能存放基本数据类型
	//Object
	
	//动态数组  存放学生
	private ArrayList stus = new ArrayList();
	//1.添加学生
	public void add(Student stu){
		if(stu==null){
			System.out.println("该学生对象是空的,不能添加");
		}else{
			stus.add(stu);
			System.out.println("添加成功");
		}
	}
	//2.查询学生  指定查询 通过name来查询
	//传入学生名字  返回一个学生
	public Student queryStudent(String name){
		//遍历动态数组
		for (Object obj : stus) {
			Student s = (Student)obj;
			if(s.getName().equals(name)){
				return s;
			}
		}
		return null;
	}
	
	
	
	//删除学生  根据ID
	public boolean deleteStudent(String id){
		
		//Student String
		for(int i = 0;i<stus.size();i++){
			Student s = (Student)stus.get(i);
			if(s.getId().equals(id)){
				stus.remove(i);//删除学生
				return true;
			}
		}
		
		return false;
	}
	
	
	//4.全部查询
	public void showAllStudents(){
		//普通for
//		for(int i=0;i<stus.size();i++){
//			Object obj = stus.get(i);
//			if(obj instanceof Student){
//				Student s1 = (Student)obj;
//				System.out.println(s1);
//			}
//		}
		
		
		//System.out.println(stus);
		
		//foreach
		for (Object obj : stus) {
			if(obj instanceof Student){
				Student s1 = (Student)obj;
				System.out.println(s1);
			}
		}
		
	}
	 

}
