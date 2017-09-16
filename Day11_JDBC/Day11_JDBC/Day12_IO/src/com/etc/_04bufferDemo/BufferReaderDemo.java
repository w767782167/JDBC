package com.etc._04bufferDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferReaderDemo {
	//D:/test.txt------>java程序中
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:/test.txt");
		BufferedReader br = new BufferedReader(fr);
		
//		String str = br.readLine();
//		while(str != null){
//			System.out.println(str);
//			str = br.readLine();
//		}
		
		String str="";
		while((str=br.readLine()) !=null){
			System.out.println(str);
		}
		
		
	}

}
