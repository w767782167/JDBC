package com.etc._01PropertiesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesTest {
	//读取db.properties文件的内容   文件---->java程序   ---->文件
	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		try {
			InputStream is = new FileInputStream("E:/javaAll/01javase/Coding/Day13_IO_SQL/src/db.properties");
			p.load(is);
			
			System.out.println(p);
			
			String name = p.getProperty("username");
			System.out.println(name);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
