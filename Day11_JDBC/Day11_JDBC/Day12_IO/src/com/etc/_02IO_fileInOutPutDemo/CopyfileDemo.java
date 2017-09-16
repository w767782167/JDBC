package com.etc._02IO_fileInOutPutDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyfileDemo {
//	案例：复制拷贝文件
	
	public static void copyFile(String srcPath,String destPath){
		
		try {
			//输入      day14------>Java程序
			FileInputStream fis = new FileInputStream(srcPath);
			
			//输出   Java程序-----> day002
			FileOutputStream fos = new FileOutputStream(destPath);
			
			//以字节流形式传输的
			byte[] b = new byte[1024];
			while(fis.read(b) != -1){  //读
				fos.write(b); //写
				
				fos.flush();//刷新
			}
			fis.close();
			fos.close();
			System.out.println("结束了");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		copyFile("E:/javaAll/01javase/课堂笔记/Word文档/day14_IO.docx", "D:/file/day002.docx");
	}

}
