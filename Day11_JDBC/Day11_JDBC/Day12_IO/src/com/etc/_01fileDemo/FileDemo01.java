package com.etc._01fileDemo;

import java.io.File;

public class FileDemo01 {
	public static void main(String[] args) {
		//案例1:将磁盘某个目录下的文件和目录打印出来看看
		//File file = new File("E:\\javaAll\\01javase\\课堂笔记");
		File file = new File("E:/javaAll/01javase/课堂笔记");
		
		if(file.exists()){//判断文件夹(目录)是否存在
			String[] lists = file.list();
			for (String string : lists) {
				System.out.println("string = "+string);
			}
			
		}else{
			System.out.println("该文件夹'目录'不存在");
		}
		
	}

}
