package com.etc._01fileDemo;

import java.io.File;

public class FileDemo02 {
//	案例2:在案例1的基础上，将目录（文件夹）和文件分别做一个说明
	public static void main(String[] args) {
		File file = new File("E:/javaAll/01javase/课堂笔记");
		if(file.exists()){
			File[] files = file.listFiles();
			for (File file2 : files) {
				if(file2.isFile()){ //判断是否是文件
					System.out.println(file2.getName()+" 文件" 
				+file2.length()+"字节");
				}else{
					System.out.println(file2.getName()+" 目录");
				}
			}
			
			
		}else{
			System.out.println("目录不存在");
		}
	}

}
