package com.etc._04Task_student;

public class StudentTest {
	
	/*学生缴学费案例
	 学生类(Student)有两个字段：
	 name(名字)和isFee(是否交学费的状态)，
	 有一个方法：交学费(fees)。
	 每一个学生都是通过Student类new出来的一个对象，
	 现在创建一个数组存放多个学生对象，
	 再判断数组中的学生是否已经缴费,如果没有,则学生的交学费方法。
	 */

	
	public static void main(String[] args) {
		Student stu1 = new Student();
		//stu1.name = "张三";
		stu1.isFee = true;
		stu1.showInfo();
		
		Student stu2 = new Student("李四");
		//stu2.name = "李四";
		stu2.showInfo();
		
		Student stu3 = new Student("老王",40);
		//stu3.name = "老王";
		stu3.isFee = false;
		stu3.showInfo();
		
		//int 是一种类型
		//int[] arr = new int[]{1,2,3};
		
		//Student 也是一种类型
		Student[] stus = new Student[]{stu1,stu2,stu3};
		for(int i = 0;i<stus.length;i++){
			Student tempStu = stus[i];
			if(!tempStu.isFee){ //tempStu.isFee == false
				tempStu.fees();
			}
			
		}
		
		
		
		
		
	}

}
